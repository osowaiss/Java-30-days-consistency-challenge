package Lec04;
import java.util.*;

public class Lec04_Loop06 {
    public static void main(String[] args){
        //Pirnt table of a number input by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number of which the table needs to be printed");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=1;i<11;i++){
            sum = n*i;
            System.out.println(sum);
        }
    }
}
