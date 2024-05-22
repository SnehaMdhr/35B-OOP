package week4;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        /*1. Write a program that asks your name and prints “Hello your name” five times. Use a loop. */
        Scanner scan = new Scanner(System.in);
        // System.out.print("Please enter your name: ");
        // String name = scan.nextLine();

        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello " + name);
        // }

        

        /*Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
        Miles    Kilometers
        1    1.609
        2    3.218
        …    ….
        9    14.481
        10    16.090 */
        System.out.println("Miles\tKilometers");

        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%d\t%.3f%n", miles, kilometers);
        }

        /*Write a program that generates the following table: 
        Number    Square
        10    100
        9    81
        ..    ….2    4
        1    1 */

        System.out.println("Number\tSquare");
        for (int i = 10; i>=1;i--){
            int sq = i*i;
            System.out.println(i+"\t"+sq);
        }

        /*Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:
        *****
        *****
        *****
        *****
        ***** */

        System.out.print("Please enter the width of the square: ");
        int width = scan.nextInt();

        for (int i = 0; i < width; i++) {  
            for (int j = 0; j < width; j++) {  
                System.out.print("*");
            }
            System.out.println();  
        }
        /* 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is
        *
        **
        ***
        ****
        *****
        Use a nested for loop to generate the above pattern. */

        System.out.print("Please enter the width of the square: ");
        int wid = scan.nextInt();

        for (int i = 0; i < wid; i++) {  
            for (int j = 0; j <= i; j++) {  
                System.out.print("*");
            }
            System.out.println();  
        }

        /*7. Write a program to calculate the HCF of Two given numbers. */
        System.out.println("Enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The HCF is "+a);
        /*8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321. */
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("The reversed is "+ rev);
        scan.close();
    }
    
}
