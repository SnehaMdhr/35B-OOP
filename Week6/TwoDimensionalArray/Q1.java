//Write a java program to Add two 2x3 matrices
package Week6.TwoDimensionalArray;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int first[][] = new int[2][3];
        int second[][] = new int[2][3];
        int result[][] = new int[2][3];
        Scanner a = new Scanner(System.in);

        System.out.println("Enter data of the first matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                first[i][j] = a.nextInt();
            }
        }

        System.out.println("Enter data of the second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                second[i][j] = a.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}