//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;

public class Lec08_Exercise_voteEligibility {
    public static void votingEligibility(int age){
        if(age>=18){
            System.out.println("Yayy! You are eligible to vote");
        }
        else if(age<=17 && age>=0){
            System.out.println("Sorry you are not yet eligible to vote :(");
        }
        else if(age<=0){
            System.out.println("Buddy you dont exist lol >_<");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age to check if you are eligible to vote!");
        int age = sc.nextInt();

        votingEligibility(age);
    }
}
