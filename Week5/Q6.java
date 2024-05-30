package Week5;
//Write a program to calculate the area of a rectangle using a method of your choice.
public class Q6 {
    public static void main(String[] args) {
        int result = areaOfRectangle(5, 10); 
        System.out.println("The area of rectangle is " + result); 
    }

    public static int areaOfRectangle(int length, int breadth) {
        return length * breadth; 
    }
}
