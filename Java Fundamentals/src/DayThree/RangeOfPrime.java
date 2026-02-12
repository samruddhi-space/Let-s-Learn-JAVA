package DayThree;

import java.util.Scanner;

public class RangeOfPrime {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            char input = 'N' ;
//        input = sc.next().charAt(0);
            do{
                int num1 , num2 ;
                System.out.print("Enter start number: ");
                num1 = sc. nextInt();
                System.out.print("Enter end number: ");
                num2 = sc.nextInt();

                if(num1 > num2){
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }

                for(int i = num1; i <= num2; i ++){
                    if(i<=1){
                        continue; //ignoring values 1 and 0
                    }
                    int count = 0; // count var is for counting no. of divisors

                    for(int j = 1; j <= i; j++){
                        if (i % j == 0){ // i%j is to check j is divisor of i or not
                            count++; // count is increased means divisor found
                        }
                    }if (count == 2){
                        System.out.println(i);
                    }
                }

                System.out.println("If you want to continue press Y ");
                //  char input ;
                input = sc.next().charAt(0);
            }while(input == 'Y');
            sc.close();// to close scanner and indicating that to stop taking input
        }
    }


