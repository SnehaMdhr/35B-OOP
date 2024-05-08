package week2;
import java.util.Scanner;
public class Taskk{
    public static void main(String[] args) {
        /* 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter the age of a person ");
        int intInput = scan.nextInt();
        if (intInput>=18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }

        /*2. Write a program to calculate SI. 
        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */

        int p=20000 , rat=10, tim=8;
        int SI=(p*rat*tim)/100;
        System.out.println("\n\nSimple interest is "+ SI); 


        /*3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */

        System.out.println("\n\nEnter Base");
        int Base = scan.nextInt();
        System.out.println("Enter Height");
        int Height = scan.nextInt();
        int area= (1/2)*Base*Height;
        System.out.println("Area of triange is "+ area);

        System.out.println("\nEnter Length");
        int Length = scan.nextInt();
        System.out.println("Enter width");
        int width = scan.nextInt();
        System.out.println("Enter Height");
        int Height1 = scan.nextInt();
        int cubiod = Length*width*Height1;
        System.out.println("Volume of cubiod is "+ cubiod);

        System.out.println("\nEnter side");
        int side = scan.nextInt();
        int cube=side*side*side;
        System.out.println("Volume of cube is "+cube);


        /*4. Write the ternary operator for question no. 1 */

        System.out.println("\n\n Enter age");
        int age =scan.nextInt();
        String canVote = (age >= 18) ? "Yes" : "No";
        System.out.println("Can the person cast a vote? " + canVote);


        /*5. Write a program to take two integer inputs from the user and print the sum and product of them. */

        System.out.println("\n\nEnter two numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int sum = num1+num2;
        int pro = num1 * num2;
        System.out.println("The sum is"+ sum+"The product is "+ pro);


        /*6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result. */

        System.out.println("\n\nEnter two numbers");
        int number1=scan.nextInt();
        int number2=scan.nextInt();
        int sum1 = number1+number2;
        int pro1 = number1 * number2;
        double div = sum1/pro1;
        System.out.println("The division is "+ div);


        /* 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */

        

    }
}
