package DayThree;

import java.util.Scanner;

public class Calculator {

//  Menu - driven calculator

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);//here i created scanner object
            // class to take input from user
            char input = 'N';

            do{
                int num1;
                int num2;
                System.out.println("enter any two numbers for calculation :");
                num1= sc.nextInt();
                num2= sc.nextInt();

                System.out.println("Choose from below:");
                System.out.println("1.Addition");
                System.out.println("2.Substraction");
                System.out.println("3.Multiplication");
                System.out.println("4.Division");

                int choice;
                System.out.println("Enter your any no. from 1 to 4:");
                choice = sc.nextInt();//taking input from user

                if(choice ==1){
                    System.out.println("Addition of "+num1+" and "+num2+" is :"+(num1+num2));
                    /* the '+' sign at first for concatenation of a string and number after addition*/
                }else if(choice ==2){
                    System.out.println("Substraction of "+num1+" and "+num2+" is :"+(num1-num2));
                }else if(choice ==3){
                    System.out.println("Multiplication of "+num1+" num2 "+num2+" is :"+(num1*num2));
                }else if(choice ==4) {
                    if (num2 != 0) {
                        System.out.println("Division of " + num1 + " and " + num2 + " is :" + (num1 / num2));
                    } else {
                        System.out.println("You choosed invalid choice ");
                    }
                }
                System.out.println("if you want to continue write Y :");
                input = sc.next().charAt(0);
            }while(input == 'Y');
            sc.close();

        }

    }


