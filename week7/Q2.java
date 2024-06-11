package week7;
//Write a Java program to create a class called “Simple Interest” with a data fields principle, time and rate, using setter getter method and print the values.
public class Q2 {
    public static void main(String[] args) {
        SimpleInterst si = new SimpleInterst();
        si.principle=1000;
        si.time=5;
        si.rate=5;
        double result =(si.principle*si.rate*si.time)/100;
        System.out.println("The simple interest is "+ result);
    }
}
class SimpleInterst{
    double principle;
    double time;
    double rate;

    void setprinciple(double p){
        principle = p;
    }
    double getprinciple(){
        return principle;
    }

    void setTime(double t){
        time = t;
    }
    double getTime(){
        return time;
    }

    void setRate(double r){
        rate = r;
    }
    double getRate(){
        return rate;
    }
}
