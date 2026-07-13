import java.util.*;

public class Lec05_patterns_HollowBox {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        //outer loop
        for(int i=1;i<=a;i++){
            //inner loop
            for(int j=1;j<=b;j++){
                if(i==1 || i==a || j==1 || j==b){
                    System.out.print("$");
                }else{
                        System.out.print(" ");
                    }
            }
            System.out.println(); //this is for going into the next line
        }
    }
}
