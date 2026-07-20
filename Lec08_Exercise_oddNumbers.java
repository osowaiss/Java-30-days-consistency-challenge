import java.util.*;

//Write a function to print the sum of all odd numbers from 1 to n.

public class Lec08_Exercise_oddNumbers {
    public static int addTheOddNumbers(int n, int sum){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the value of n.");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("The Sum of odd numbers until n is :"+addTheOddNumbers(n, sum));
    }
}
