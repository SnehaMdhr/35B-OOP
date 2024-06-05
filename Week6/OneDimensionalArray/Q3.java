package Week6.OneDimensionalArray;

public class Q3 {
    public static void main(String[] args) {
        int[] array = {8, 10, 5, 12, 50}; 

        int max = array[0];
        int min = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i]; 
            }
        }

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }
}
