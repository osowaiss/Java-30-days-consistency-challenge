import java.util.*;

public class Lec07_Funtions_tableOfNum {

    //function for printing a table
    public static void calculateTable(int n, int ans){
        for(int i=1;i<=10;i++){
            ans=n*i;
            System.out.println(ans);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a number to print it's table.");
        int n = sc.nextInt();

        //calling function
        calculateTable(n, n);
    }
}
