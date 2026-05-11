package codeHelp;
import java.util.Scanner;
public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name :");
        String firstName = sc.nextLine().toLowerCase();

        System.out.println("The lower case of the word is : :"+firstName.toLowerCase());

    }
}
