package week7;
//Write a Java program to create a class called "Circle" with a radius attribute. You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.
public class Q1 {
    public static void main(String[] args) {
        circle c = new circle();
        c.radius = 2.5;
        double area = 3.14 * c.radius * c.radius;
        double cir = 2 * 3.14 * c.radius;
        System.out.println("The area is "+ area);
        System.out.println("The circumferance is "+cir);
    }
}
class circle{
    double radius;
    void setRadius(double r){
        radius = r;
    }
    double getRadius(){
        return radius;
    }
}