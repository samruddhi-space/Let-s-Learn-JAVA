package DayTwelve;

public class solidRightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                // no. of stars  = no. of row
                //for eg., for 1st row 1 * will print for 2nd row 2 stars will print
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
