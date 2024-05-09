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
        double Base = scan.nextInt();
        System.out.println("Enter Height");
        double Height = scan.nextInt();
        double area= 0.5*Base*Height;
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
        double div = (double) sum1/pro1;
        System.out.println("The division is "+ div);


        /* 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */

        System.out.println("\n\nEnter your name");
        String name = scan.next();
        System.out.println("Enter your roll number");
        int roll = scan.nextInt();
        System.out.println("Enter your field of interest");
        String field = scan.next();
        System.out.println("Hey, my name is "+name+" and my roll number is "+roll+". My field of interest is "+field);

        /* 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.         */

        System.out.println("\n\nEnter side of square");
        int sidee = scan.nextInt();
        int areaa = sidee*sidee;
        int peri = 4 *sidee;
        System.out.println("The area of square is "+ areaa + " and the perimeter of square is "+ peri);

        System.out.println("\nEnter principal");
        int pr=scan.nextInt();
        System.out.println("Enter rate");
        int r=scan.nextInt();
        System.out.println("Enter time");
        int t=scan.nextInt();
        double sii =(pr*t*r)/100;
        System.out.println("The simple interest is "+ sii);

        System.out.println("\nEnter base");
        double b=scan.nextInt();
        System.out.println("Enter height");
        double h=scan.nextInt();
        double tri= 0.5*b*h;
        System.out.println("The area of triangle is "+tri);


        System.out.println("\nEnter side");
        int l = scan.nextInt();
        int c=l*l*l;
        System.out.println("Volume of cube is "+c);

        System.out.println("\nEnter Length");
        int l1 = scan.nextInt();
        System.out.println("Enter width");
        int b1 = scan.nextInt();
        System.out.println("Enter Height");
        int h1 = scan.nextInt();
        int cu = l1*b1*h1;
        System.out.println("Volume of cubiod is "+ cu);


        /*9. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */

        System.out.println("\n\nEnter length");
        double len=scan.nextDouble();
        System.out.println("Enter breadth");
        double bre = scan.nextDouble();
        double a = len * bre;
        int aInt = (int) a;
        System.out.println("The area is "+ aInt);



        /*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper Second Class
        c. If more than 49 -> Second class
        d. If more than 39 -> Third class and if below than 40 the result is fail. 
        Hint: Use ternary operator */

        System.out.println("\n\nEnter marks in subject 1 ");
        int sub1 = scan.nextInt();
        System.out.println("Enter marks in subject 2 ");
        int sub2 = scan.nextInt();
        System.out.println("Enter marks in subject 3 ");
        int sub3 = scan.nextInt();
        System.out.println("Enter marks in subject 4 ");
        int sub4 = scan.nextInt();
        int tot = (sub1+sub2+sub3+sub4);
        double per = tot/4;
        String result = per >= 70 ? "First Class" :per > 59 ? "Upper second class" : per > 49 ? "Second class" : per > 39 ? " Third" : "Fail";
        System.out.println("The total is "+tot);
        System.out.println("The percentage is "+per);
        System.out.println("The obtained result is "+result);
        scan.close();


    }
}
