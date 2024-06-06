package Week6.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//WAP to sort the integer elements of array of size 10 in ascending and descending order using ArrayList.
public class Q2 {
    public static void main(String[] args) {
        int[] array = {34, 7, 23, 32, 5, 62, 12, 98, 45, 21};

        // Create an ArrayList and add elements from the array
        ArrayList<Integer> numbers = new ArrayList<>(10);
        for (int number : array) {
            numbers.add(number);
        }

        // Sorting in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Sorting in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in descending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
