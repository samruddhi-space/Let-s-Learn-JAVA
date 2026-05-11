package codeHelp;
import java.util.Scanner;
public class CheckEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age ;
        System.out.println("Enter your age :");
        age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are not eligible for vote");
        }else if (age  >= 18){
            System.out.println("You are eligible for vote");
        }else{
            System.out.println("Invalid Age entered please enter correctly");
        }
    }



}
