package DaySix;

public class Player {
    int playerId ;
    String playerName;
    int totalBallsFaced;
    int totalRunsScored;
    int noOfMatchesPlayed ;

Player(int id, String n, int TBF, int TRS, int NMP){
        playerId = id;
        playerName = n;
        totalBallsFaced = TBF;
        totalRunsScored = TRS;
        noOfMatchesPlayed = NMP;
}
double Calculate_BSR(){
    return (totalRunsScored/totalBallsFaced)*100 ;
}
void display(){
    System.out.println("Player Id : "+playerId);
    System.out.println("Player name :"+playerName);
    System.out.println("Total balss faced :"+totalBallsFaced);
    System.out.println("Total runs scored :"+totalRunsScored);
    System.out.println("Total no of Matches played :"+noOfMatchesPlayed);
}
public static void main (String[]args){
    Player b1 = new Player(1,"Sam",6,12,3);//200
    Player b2 = new Player(2,"Sumit",3,9,3);//300 -> should be best strick rate
    Player b3 = new Player(3,"Samir",4,4,3);//100

    if (b1.Calculate_BSR() > b2.Calculate_BSR() && b1.Calculate_BSR() > b3.Calculate_BSR() ){
        b1.display();
    }else if (b2.Calculate_BSR() > b3.Calculate_BSR() && b2.Calculate_BSR() > b1.Calculate_BSR()){
        b2.display();
    }else{
        b3.display();
    }

}
}
