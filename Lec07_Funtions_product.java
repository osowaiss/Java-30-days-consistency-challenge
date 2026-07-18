import java.util.*;

public class Lec07_Funtions_product {
    public static int claculateProduct(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        int mul = claculateProduct(a, b);
        System.out.println("Product of the entered numbers is :"+mul);
    }
}
