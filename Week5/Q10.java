package Week5;
/*Write a Java program to display all prime numbers less than a given number and count all the prime numbers less than that number using functions.  
Your program should contain two functions: 
a.    print_prime_less_than that takes a number as a parameter and prints the prime number less than that number 
b.    is_prime that takes a number as a parameter and then returns whether that number is prime.
*/
public class Q10 {
    public static void main(String[] args) {
        int number = 30; // Example number
        System.out.println("Prime numbers less than " + number + ":");
        printPrimesLessThan(number);
        int primeCount = countPrimesLessThan(number);
        System.out.println("Total prime numbers less than " + number + ": " + primeCount);
    }

    public static void printPrimesLessThan(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

  
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimesLessThan(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
