import java.util.*;

public class Lec03_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("press between 1-5 to perform the operations like \n 1 -> Add\n 2 -> Sub\n 3-> Mul\n 4->Div\n 5->Rem\n");
        int operators = sc.nextInt();
    
        switch(operators){
            case 1 : System.out.println("Addition of two numbers is :"+(a+b));
            break;
            case 2 : System.out.println("Subtraction of two numbers if :"+(a-b));
            break;
            case 3 : System.out.println("Multiplication of two numbers is :"+(a*b));
            break;
            case 4 : System.out.println("division of two numbers is :"+(a/b));
            break;
            case 5 : System.out.println("Modulo of two numbers is :"+(a%b));
            break;
            default : System.out.println("Invalid input.");
        }
    }
}
