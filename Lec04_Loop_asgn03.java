import java.util.*;

public class Lec04_Loop_asgn03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the subjects");
        int input;

       do{
        int marks = sc.nextInt();
        if(marks >= 80 && marks <=100){
            System.out.println("It is a good score");
        }

        else if(marks >= 50 && marks < 80){
            System.out.println("This is also a good score.");
        }

        else if(marks >=0 && marks <=49){
            System.out.println("This too is a good score because the sore doesnt matter the efforts does");
        }

        else{
            System.out.println("Invalid input");
        }

        System.out.println("want to continue? (Yes(1) or no(0))");
        input = sc.nextInt();

       }while(input==1);

    }
}
