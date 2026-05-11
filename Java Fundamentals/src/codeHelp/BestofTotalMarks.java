package codeHelp;
import java.util.Scanner;
public class BestofTotalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1, m2, m3, m4, m5;
        System.out.print("Enter the first marks: ");
        m1 = sc.nextInt();
        System.out.print("Enter the second marks: ");
        m2 = sc.nextInt();
        System.out.print("Enter the third marks: ");
        m3 = sc.nextInt();
        System.out.print("Enter the fourth marks: ");
        m4 = sc.nextInt();
        System.out.print("Enter the fifth marks: ");
        m5 = sc.nextInt();

        int smallest;
        int sum = 0;

        if(m1 <= m2 && m1 <= m3 && m1 <= m4 && m1 <= m5){
            smallest = m1;
            sum =  m2 + m3 + m4 + m5;
        }else if (m2 <= m1 && m2 <= m3 && m2 <= m4 && m2 <= m5){
            smallest = m2;
            sum =  m1 + m3 + m4 + m5;
        }else if(m3 <= m1 && m3 <= m4 && m3 <= m5 && m3 <= m2){
            smallest = m3;
            sum =  m1 + m2 + m4 + m5;
        }else if(m4 <= m1 && m4 <= m5 && m4 <= m2 && m4 <= m3){
            smallest = m4;
            sum =  m1 + m3 + m2 + m5;
        }else {
            smallest = m5;
            sum =  m1 + m3 + m2 + m4;
        }

         float percentage = ((float)(sum)/400) * 100;

        System.out.println("The total of 4 subjects excluding smallest one is "+percentage);
    }
}
