package DayTwelve;
import java.util.Scanner;

public class solidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row , col;
        System.out.println("Enter the no. of rows :");
        row = sc.nextInt();
        System.out.println("Enter the no. of columns :");
        col = sc.nextInt();

        for(int i = 1; i<= row; i++){
            for(int j = 1; j<= col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
