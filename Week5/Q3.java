package Week5;
//Make a method to print the table of a given number n.
public class Q3 {
    public static void main(String[] args) {
        multiple(10);
    }

    public static void multiple(int n){
        for (int i = 1; i <=10; i++){
            System.out.println(n+" X "+ i+" = "+n*i);
        }
    }
}
