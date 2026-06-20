package DayTwelve;

public class invertedRightAngleTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++){
            // for each row -> variable coloum

            for(int col = 1; col<= n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
