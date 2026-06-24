package DayTwelve;

public class solidDiamond {
    public static void main(String[]args){
        int n =4;

        for(int row = 1; row<=n; row++){

            for(int col = 1; col<=n-row; col++){
                System.out.print(" ");
                //for spaces
            }
            for (int col = 1; col<=2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
//inverted solidPyramid
        for(int row = 1; row <= n; row++){
            if(row==1){//for diamond shape
                continue;
            }
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
