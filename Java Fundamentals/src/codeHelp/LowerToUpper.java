package codeHelp;
import java.util.Scanner;
public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        String firstName = sc.nextLine().toLowerCase();

        System.out.println("The uppercase of the word is : "+firstName.toUpperCase());
    }

}
