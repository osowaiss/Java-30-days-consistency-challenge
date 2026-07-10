import java.util.*;

public class Lec03_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number A"); 
        int a = sc.nextInt();
        System.out.println("Enter a number B");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("They are equal");
        }
        else if(a>b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
    }
}
