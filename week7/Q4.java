package week7;
//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
public class Q4 { 
    public static void main(String[] args) {
        Employee emp = new Employee("Sneha", "Software Engineer", 15000);
        System.out.println("Initial details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Job Title: " + emp.getJobTitle());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Yearly Salary: " + emp.calculateYearlySalary());
        emp.giveRaise(10);
    }
    
}
class Employee {
    String name;
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
    
    String getJobTitle() {
        return jobTitle;
    }

    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    double calculateYearlySalary() {
        return salary * 12;
    }


    void giveRaise(double percentage) {
        double raiseAmount = salary * (percentage / 100);
        salary += raiseAmount;
        System.out.println(name + " received a raise of " + raiseAmount + " and new salary is " + salary);
    }

}