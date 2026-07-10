import java.util.*;

public class Lec03_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to be greeted in English");
        System.out.println("Press 2 to be greeted in Hindi");
        System.out.println("Press 3 to be greeted in French");
        int one = sc.nextInt();

        switch(one){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid input");
        }
    }
}