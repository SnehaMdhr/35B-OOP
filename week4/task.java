package week4;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        /*1. Write a program that asks your name and prints “Hello your name” five times. Use a loop. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + name);
        }

        

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
        /*Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
        Sample Run:
        Enter a positive non-zero integer 4
        Sum of 1 to 4 is 10
        Do you want to continue? Enter ‘y’ for yes or any other character for no.
        y
        Enter a positive non-zero integer 3
        Sum of 1 to 3 is 6
        Do you want to continue? Enter ‘y’ for yes and any other character for no.
        n. */
        char continueChoice;

        do {
            System.out.print("Enter a positive non-zero integer: ");
            int width1 = scan.nextInt();

            if (width1 > 0) {
                // Generate and print the square of asterisks
                for (int i = 0; i < width1; i++) {
                    for (int j = 0; j < width1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                // Calculate and print the sum of integers from 1 to width
                int sum = 0;
                for (int i = 1; i <= width1; i++) {
                    sum += i;
                }
                System.out.println("Sum of 1 to " + width1 + " is " + sum);
            } else {
                System.out.println("Please enter a positive non-zero integer.");
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? Enter 'y' for yes or any other character for no: ");
            continueChoice = scan.next().charAt(0);
        } while (Character.toLowerCase(continueChoice) == 'y');
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

        /*9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50. */
        int numbeq = 0;
        int numbgre = 0 ;
        int numbles = 0 ;
        int sumnumbgre = 0 ;
        int sumnumbless = 0;
        System.out.println("Enter 10 numbers");
        for (int i=0; i<10; i++){
            int numb = scan.nextInt();
            if (numb == 50){
                numbeq = numbeq + 1;
            }
            else if (numb < 50){
                numbles = numbles + 1;
                sumnumbless = sumnumbless + numb;
            }
            else{
                numbgre = numbgre + 1;
                sumnumbgre= sumnumbgre+numb;
            }


        }
        double avgofgre = sumnumbgre/numbgre;
        double avgofless = sumnumbless/numbles;

        System.out.println("Number of inputs greater than 50: " + numbgre);
        System.out.println("Number of inputs less than 50: " + numbles);
        System.out.println("Number of inputs equal to 50: " + numbeq);
        System.out.println("Average of numbers greater than 50: " + avgofgre);
        System.out.println("Average of numbers less than 50: " + avgofless);

        /*10. Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, if the user enters 50, the loop will find the sum of 1+2+3+4+….+50. */
        System.out.println("Enter a positive non zero element");
        int non = scan.nextInt();
        int summ = 0;
        for(int i = 1; i<non; i++){
            summ = summ +i;
        }
        System.out.println("The sum is "+ summ);
        scan.close();
    }
    
}
