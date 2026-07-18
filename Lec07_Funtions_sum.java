import java.util.*;

public class Lec07_Funtions_sum {

    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the vlaue of b :");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("The Sum of the given numbers is :");
        System.out.println(sum);
    }
}
