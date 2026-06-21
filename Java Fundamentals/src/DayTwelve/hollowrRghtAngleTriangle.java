package DayTwelve;

public class hollowrRghtAngleTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {

            if (row == 1 || row == 2 || row == n) {
                for (int col = 1; col <= row; col++) {


                    System.out.print("* ");
                }
            }
            else{
                    //for remaining/ middle rows -> star, space , star
                    // first star
                    System.out.print("* ");

                    // for space
                    for (int col = 1; col <= row - 2; col++) {
                        System.out.print("  ");
                    }

                    //1 * after that
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        }


