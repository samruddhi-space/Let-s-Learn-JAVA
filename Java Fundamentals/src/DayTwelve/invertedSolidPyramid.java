package DayTwelve;

public class invertedSolidPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row-1; col++){
                //for space
                System.out.print(" ");
            }
            for(int col = 1; col <=2*n-2*row+1 ; col++){
                //for star
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
