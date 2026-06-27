package DayThirteen;

public class methodsQuestionPractice {

//1
//    static void  printMsgWelcome(){
//        System.out.println("Welcome!");
//    }


//2
//    static int add(int a, int b){
//        return a+b;
//    }

//3
//    static int isEven(int num){
//        if(num % 2 == 0){
//            System.out.println("True");
//        }
//        return 0;
//    }

//4
//       static int  getMaximum(int s , int q){
//           if(s<q){
//               return q;
//               //System.out.println("The maximum number is :" + q);
//           }
//           else{
//               return s;
//           }
//       }


//5
//         static int calculatePerentage(int obtained, int total){
//             int result = (obtained * total) / 100;
//             return result;
//         }


//6
//          static int display(int num){
//              return num;
//          }
//
//          static String display(String name){
//              //System.out.println(name);
//              return name;
//          }


//7 -> pass by value (the copy of the original var is used in method
             static int updateValue(int x){
                 int value = x +1;
                 return value;
             }


    public static void main(String[] args) {
//        printMsgWelcome();

//        int sum = add(25,25);
//        System.out.println(sum);

//         int result = isEven(5);
//       System.out.println(result);

//       int finalResult= getMaximum(2,9);
//       System.out.println(finalResult);

//         int percentage = calculatePerentage(85, 100);
//         System.out.println("The percentage is :" + percentage);

//        int Display = display(10);
//        System.out.println("The no. is :" + Display);

//        String Name = display("Samruddhi");
//        System.out.println("The name is :" + Name);


//Pass by Value
//        int originalValue = 2;
//        System.out.println("Original value is :" + originalValue);
//
//        int passbyValue= updateValue(originalValue);
//        System.out.println("Updated value in method call is :" + passbyValue);
//
//        System.out.println("Original value is :" + originalValue);









    }
}
