import java.util.*;

public class Lec06_patterns2_NumberPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print the pattern of Number Pyramid");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
