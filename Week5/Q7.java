package Week5;
//Calculates the factorial of a given number using the Java method.
public class Q7 {
    public static void main(String[] args) {
        int factorial = calculateFactorial(5);
        System.out.println("Factorial is: " + factorial);
    }
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
}
