package Week6.OneDimensionalArray;
//Write a Java program to test if an array contains a specific value.
public class Q2 {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};
        int targetValue = 15;

        boolean containsValue = false;

        for (int num : array) {
            if (num == targetValue) {
                containsValue = true;
                break; 
            }
        }

        if (containsValue) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}
