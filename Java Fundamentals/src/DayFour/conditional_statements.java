package DayFour;
import java.util.Scanner;
public class conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Comparison of 3 numbers using if - else conditional statement

        int a, b, c;
        char ch = 'n';
        System.out.println("Enter any three numbers you want to compare :");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        do {
            if (a > b && a > c) {
                System.out.println("The Greater no. among these is :" + a);
            } else if (b > a && b > c) {
                System.out.println("The Greater no. among these is :" + b);
            } else {
                System.out.println("The Greater no. among these is :" + c);
            }
            System.out.println("Do you want to continue? y/n");
            ch = sc.next().charAt(0);
        }while(ch == 'y');{
            //System.out.println("Do you want to continue? y/n");
            sc.close();
        }
    }
}