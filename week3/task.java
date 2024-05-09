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
      
    
        scan.close();


    }
}