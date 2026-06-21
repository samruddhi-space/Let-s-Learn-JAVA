package DayTwelve;

public class hollowRectangle {
    public static void main(String[] args) {
        int n = 4;

        for(int row=1;row<=n;row++){
            for(int col=1;col<=6;col++){
                if(row ==1 || row ==n){
                    //for 1st and last row
                    System.out.print("* ");
                }
                else{
                    //for middle rows / 1st and last column
                    if(col==1){
                        System.out.print("* ");
                    }
                    else if(col ==6){
                        System.out.print("* ");
                    }
                    else {
                        //for middle columns
                        System.out.print("  ");// two spaces in between
                    }

                }
            }
            System.out.println();

        }
    }
}
