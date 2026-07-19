import java.util.*;

public class Lec08_Exercise_avgUsingFunction {
    
    //fuction to print average
    public static int printingAverage(int a,int b,int c,int avg){
        avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("Enter the Third number :");
        int c = sc.nextInt();

        //summoning the funtion suuuiiiiiiiii
        System.out.println("The Average of entered numbers is :"+printingAverage(a, b, c, a));
    }
}
