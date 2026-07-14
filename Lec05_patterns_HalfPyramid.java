import java.util.*;

public class Lec05_patterns_HalfPyramid {
    public static void main(String[] args){
        //Write a program to achive a pattern of a Half Pyramid
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();


        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
