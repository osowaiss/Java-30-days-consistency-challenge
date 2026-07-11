package Lec03;
import java.util.*;

public class Lec03_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to be greeted in English");
        System.out.println("Press 2 to be greeted in Hindi");
        System.out.println("Press 3 to be greeted in French");
        int one = sc.nextInt();

        if(one == 1){
            System.out.println("Hello");
        }
        else if(one == 2){
            System.out.println("Namaste");
        }
        else if(one == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
