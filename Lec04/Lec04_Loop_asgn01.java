package Lec04;
import java.util.*;

public class Lec04_Loop_asgn01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=2; i<=n; i++){
            sum = i++;
            System.out.println(sum);
        }
    }    
}
