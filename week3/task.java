package week3;
import java.util.Scanner;
public class task{
    public static void main(String[] args) {
        /* Task to DO */
        /*1. Write a JAVA program to find the maximum between three numbers. */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter three numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = a;
        if (b>a){
            max=b;
        }
        if (c>a){
            max=c;
        }
        System.out.println("The maximum is "+max);

        /*2. Write a JAVA program to check whether a number is negative, positive, or zero. */
        System.out.println("Enter a number");
        int num = scan.nextInt();
        if (num==0){
            System.out.println("The number is zero");
        }
        if (num>=1){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }


        /*3.  Write a JAVA program to check whether a number is divisible by 5 and 11 or not */

        System.out.println("Enter a number");
        int div = scan.nextInt();
        if(div%5==0 && div%11==0){
            System.out.println("The number is divisible by both 5 and ll");
        }
        else{
            System.out.println("The number is not divisible by both 5 and 11");
        }

        /*4. Write a JAVA program to check whether a number is even or odd. */
        System.out.println("Enter a number");
        int eo = scan.nextInt();
        if(eo%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

        /*5. Write a JAVA program to check whether a year is a leap year or not. 
        Hint: if year%4==0; if year%100!==0 ; year%400==0; */

        System.out.println("Enter a year:");
        int year = scan.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }


        /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        System.out.println("Enter an alphabet:");
        char ch = scan.next().charAt(0);

        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }


        /* Some Switch case Statements Questions: */

        /* 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */
        System.out.println("Enter student's grade (A, B, C, D, or F):");
        char grade = scan.next().charAt(0);

        grade = Character.toUpperCase(grade);

        double gpa;

        switch (grade) {
            case 'A':
                gpa = 4.0;
                System.out.println("GPA value for grade " + grade + " is: " + gpa);
                break;
            case 'B':
                gpa = 3.2;
                System.out.println("GPA value for grade " + grade + " is: " + gpa);
                break;
            case 'C':
                gpa = 2.4;
                System.out.println("GPA value for grade " + grade + " is: " + gpa);
                break;
            case 'D':
                gpa = 2.0;
                System.out.println("GPA value for grade " + grade + " is: " + gpa);
                break;
            case 'F':
                gpa = 1.6;
                System.out.println("GPA value for grade " + grade + " is: " + gpa);
                break;
            default:
                System.out.println("Invalid grade entered.");
        }

        /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement. */
        System.out.println("Enter two numbers");
        int aa = scan.nextInt();
        int ab = scan.nextInt();

        System.out.println("Enter (+, -, *, /) operation");
        char op = scan.next().charAt(0);
        double result;
        switch (op){
            case '+':
                result= aa +ab;
                System.out.println("The sum is "+ result);
                break;

            case '-':
                result= aa -ab;
                System.out.println("The difference is "+ result);
                break;

            case '*':
                result= aa *ab;
                System.out.println("The multiplication is "+ result);
                break;

            case '/':
                result= aa /ab;
                System.out.println("The division is "+ result);
                break;

            default:
                System.out.println("Invalid input");
                break;

            
            }

        /*3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        System.out.println("Enter a number");
        int number = scan.nextInt();
        switch (number){
            case 1:
            case 2:
            case 3:
                System.out.println("The season is winter");
                break;


            case 4:
            case 5:
            case 6:
                System.out.println("The season is spring");
                break;
        
            case 7:
            case 8:
            case 9:
                System.out.println("The season is summer");
                break;


            case 10:
            case 11:
            case 12:
                System.out.println("The season is fall");
                break;

            default:
                System.out.println("invalid input");
                break;
        }


        /*4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case. */
        System.out.println("Choose a shape(Circle, Rectangle, Square, Triange) to calculate its area:");
        String choice = scan.next();

        double area = 0.0;

        switch (choice) {
            case "Circle":
                System.out.println("Enter the radius of the circle:");
                double radius = scan.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case "Rectangle":
                System.out.println("Enter the length of the rectangle:");
                double length = scan.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double width = scan.nextDouble();
                area = length * width;
                break;
            case "Square":
                System.out.println("Enter the side length of the square:");
                double side = scan.nextDouble();
                area = side * side;
                break;
            case "Triange":
                System.out.println("Enter the base of the triangle:");
                double base = scan.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = scan.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice. ");
                break;
        }

        if (area != 0.0) {
            System.out.println("The area of the selected shape is: " + area);
        }





        
      
    
        scan.close();


    }
}