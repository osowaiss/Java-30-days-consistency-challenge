import java.util.*;

public class Lec04_Loop05 {
    public static void main(String[] args){
        //Print the sum of n natural numbers like n=5
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println("The sum of n natural numbers is :"+sum);
    }
}
