package Week5;
//Make a method to check if a given number n is even or not.
public class Q2 {
    public static void main(String[] args) {
        Q2 e = new Q2();
        String returnEven = e.isEven(10);
        System.out.println("The number is "+returnEven);
    }

    String isEven(int a){
        if (a%2 == 0){
            return "even";
        }
        else {
            return "not even";
        }
    }
}

