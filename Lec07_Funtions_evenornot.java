import java.util.*;

public class Lec07_Funtions_evenornot {
    public static void checkIfEven(int n){

        //for negative numbers
        if(n<0){
            System.out.println("Please Enter a positive number.");
            return;
        }
        
        //for positive numbers
        if(n%2==0){
            System.out.println("The entered number is Even.");
        }
        else{
            System.out.println("The Entered number is odd");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if the number is Even or Odd");
        int n = sc.nextInt();

        checkIfEven(n);
    }
}
