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

        /*Write a program to calculate SI. 
        Formula Simple Interest = (PrincipleAmount*Time*Rate/100); */

        int p=20000 , rat=10, tim=8;
        int SI=(p*rat*tim)/100;
        System.out.println("\n\nSimple interest is "+ SI); 


        /* Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
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


        




    }
}
