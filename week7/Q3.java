package week7;
//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
public class Q3 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Fuche", "Pug");
        Dog d2 = new Dog("Kalu", "Lab"); 
        
        d1.setName("alu");
        d1.setBreed("gold");

        System.out.println(d1.getName() +" "+ d1.getBreed());
        System.out.println(d2.getName()+" "+d2.getBreed());
    }
}
class Dog{
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

  
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    String getBreed() {
        return breed;
    }
}
