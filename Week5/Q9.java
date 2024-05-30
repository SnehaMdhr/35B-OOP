package Week5;
//Write a Java program to find the greatest common divisor (GCD) of two numbers.
public class Q9 {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 10;
        int gcd = findGCD(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
