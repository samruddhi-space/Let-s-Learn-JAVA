package DayThirteen;

public class methodsPractice {
//method or function declaration/ definition
//    static void printTable(){
//        for(int i =1; i<=10; i++){
//            int ans = i* 2;
//            System.out.println("The table is :"+ans);
//        }
//    }

    // Prametarized method declaration

//    static void printSum(int x , int y){
//        int sum = x + y;
//        System.out.print(sum);
//    }

    //return keyword usage
//    static void multiply(int a, int b){
//        System.out.println("Multiplying :"+(a*b));
//        return;
//    }

    //using non-void return type
    static int rollno(int a){

        return a;
    }


    public static void main(String[] args) {

        //printTable();

        //printSum(1,2);

        //multiply(5,1);

        int roll = rollno(20);
        // variable is used cause
        // we have to store that returned value in something to print
        System.out.println("The roll no is :" + roll);
    }
}

// METHOD SIGNATURE concept
// in method signature -> name of func/method, return type of method ,
// ,if it have parameter then parameter
