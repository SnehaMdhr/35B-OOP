package Week5;
//Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.
public class Q4 {
    public static void main(String[] args) {
        int result = multiply3(5, 10, 20);
        System.out.println("The product is " + result); 
    }

    public static int multiply3(int a, int b, int c) { 
        int d = a * b * c; 
        return d; 
    }
}
