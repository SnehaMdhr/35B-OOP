package Week6.ArrayList;
//Write code that creates an ArrayList that can hold string objects. Add the names of three cars to the ArrayList, and then display the contents of the ArrayList.
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        // Add the names of three cars to the ArrayList
        cars.add("Tesla ");
        cars.add("Maruti");
        cars.add("Sujuki");

        // Display the contents of the ArrayList
        System.out.println("List of cars:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
