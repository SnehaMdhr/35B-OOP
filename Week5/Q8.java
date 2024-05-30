package Week5;
//Calculate the nth Fibonacci number using the method.
public class Q8 {
    public static void main(String[] args) {
        Q8 fib = new Q8();
        int returnFib = fib.calculateFibonacci(9);
        System.out.println(returnFib);
    }
    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
