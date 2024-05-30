package Week5;
//Write a program for calculating Simple Interest using a method and print the result from the method itself.
public class Q5 {
    public static void main(String[] args) {
        SI(5000, 20, 6); 
         
    }

    public static void SI(int principal, int rate, int time) {
        double result = (principal * rate * time) / 100.0; 
        System.out.println("The Simple Interest is " + result);
    }
}
