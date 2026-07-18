import java.util.*;

public class Lec06_patterns2_PalindromicPattern {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print the pattern of Palindromic Pattern");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //first half
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            //second half
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
