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

        int roll = rollno(20);//to store the value of the function we need to declare var (here...roll)
        // variable is used cause
        // we have to store that returned value in something to print
        System.out.println("The roll no is :" + roll);
    }
}

// METHOD SIGNATURE concept
// in method signature -> name of func/method, return type of method ,
// ,if it have parameter then parameter


//HOMEWORK Q
//Question : What is Method Call Stack ?
//
//This is temporary, organised memory area that tracks active methods in a running java thread.
//
//When a method is called in java, its stack frames stores 4 main pieces of information.
//
//(1) Local Variables
//(2) Object Reference
//(3) Workspace Memory
//(4) Return Address
//
//In depth :
//
//-> Local Variable :  Fixed size array that stores all the parameters and local variables used by the method
//
//->Object Reference: Complex types like String, custom objects, collections like ArrayList do not live on the stack. Instead the stack frame only holds a reference pointer (the memory address).
//
//Note:  The actual data structures lives in the Heap Memory.
//
//->Workspace Memory: Called as operand stack. This is small workspace data structure utilised as LIFO stack to execute bytecode instructions.
//
//When java program performs math or logical evaluations (like a + b) the JVM pushes values onto the operand stack, pops them off to perform the arithmetic operations and then pushes the result back.
//
//->Return Address: A pointer telling the program where to go back to when the method finishes.
