package codeHelp;
import java.util.Scanner;
public class PercentageTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3,m4,m5;
        System.out.println("Enter Marks of Subject 1 :");
        m1 = sc.nextInt();

        System.out.println("Enter Marks of Subject 2 :");
        m2 = sc.nextInt();

        System.out.println("Enter Marks of Subject 3:");
        m3 = sc.nextInt();

        System.out.println("Enter Marks of Subject 4 :");
        m4 = sc.nextInt();

        System.out.println("Enter Marks of Subject 5 :");
        m5 = sc.nextInt();
        int sum = m1+m2+m3+m4+m5;
        float total = ((float)sum/ 500) * 100;

        System.out.println("Total Percentage of Subjects :" + total +"%");
    }

}
