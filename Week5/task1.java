package Week5;
//Make a method to check if a number is prime or not.
public class task1 {
    public static void main(String[] args) {
        String num = isPrime(15);
        System.out.println("The number is "+ num);
    }
    public static String isPrime(int n) {
        if (n <= 1) {
            return "not prime";
        }
        if (n <= 3) {
            return "prime";
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return "not prime";
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return "not prime";
            }
        }
        return "not prime";
    }
}
