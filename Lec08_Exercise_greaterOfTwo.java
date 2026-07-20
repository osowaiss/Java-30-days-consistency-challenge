import java.util.*;

public class Lec08_Exercise_greaterOfTwo {
    public static void greaterOfTwoNumbers(int a, int b){
        if(a>b){
            System.out.println("The first number is greater which is :"+a);
        }
        else{
            System.out.println("The second number is greater which is :"+b);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();

        greaterOfTwoNumbers(a, b);
    }
}
