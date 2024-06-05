package Week6.OneDimensionalArray;
//Write a Java program to calculate the average value of array element.
public class Q1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;

        System.out.println("The average of the array is: " + average);
    }
}
