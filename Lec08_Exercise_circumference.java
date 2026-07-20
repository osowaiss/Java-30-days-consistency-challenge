//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;


public class Lec08_Exercise_circumference {
    public static double circumferenceOfCircle(double r){
        double pi = 3.14;
        double circum = 2*pi*r;
        return circum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        float r = sc.nextFloat();

        System.out.print("The circumference of the circle is :"+circumferenceOfCircle(r));
    }    
}
