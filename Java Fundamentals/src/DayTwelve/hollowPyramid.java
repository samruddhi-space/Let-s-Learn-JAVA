package DayTwelve;

public class hollowPyramid {
    public static void main(String[] args) {

        int n= 5;

        for(int row=1;row<=n;row++){
                for(int col=1;col<=n-row;col++){
                //for spaces -> part 1
                     System.out.print("  ");
                }
                //part 2
                if(row ==1 || row == n){
                    // for 1st and last row
                    for(int col=1;col<= 2*row-1;col++){
                        System.out.print("* ");
                    }
                }else{
                    //for middle rows

                    // star , space, star

                    //1*
                    System.out.print("* ");

                    //space
                    //formula -> 2*row+1-4 or 2*row-3
                    for(int col=1;col<= 2*row-3;col++){
                        System.out.print("  ");
                    }

                    //1*
                    System.out.print("* ");

                }
                System.out.println();
            }
        }
    }

