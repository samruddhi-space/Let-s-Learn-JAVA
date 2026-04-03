package DayEight;
import java.util.Scanner;
public class ExceptionDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        int solution;
        System.out.println("Enter any number for the arithmetic operations : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println("for division : " + "\n n1 = " + n1 +"\n n2 = " +n2);

        try{
            solution = n1/n2;

        } catch(ArithmeticException e){
            System.out.println("ERROR OCCUERED Not Divisible By 0 ");
        }finally{
            System.out.println("either error occured or not this block will execute \n"+"the solution is :"+(n1/n2));

        }
    }
}
