package Lec03;
import java.util.*;

public class Lec03_01{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        
        if(age>18){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("You are not an Audult.");
        }
    }
}