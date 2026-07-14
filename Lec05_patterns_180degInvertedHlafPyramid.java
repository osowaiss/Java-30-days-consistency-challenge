import java.util.*;

public class Lec05_patterns_180degInvertedHlafPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        //outer loop
        for(int i=1; i<=n;i++){
            //inner loop 1
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop 2
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}