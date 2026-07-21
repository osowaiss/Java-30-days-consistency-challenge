//Write a program to enter the numbers till the user wants and 
// at the end it should display the count of positive, negative and zeros entered.
import java.util.*;

public class Lec08_Exercise_bigOne {

    public static void untilUserEntersNumber(Scanner sc) {

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Do you want to enter another number? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("\nResult:");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        untilUserEntersNumber(sc);

        sc.close();
    }
}