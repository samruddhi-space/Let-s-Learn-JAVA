package DayFive;

public class DoubtHW {
    public static void main(String[]args){

        // HW_1 -> Pre and post increment operators

        // int a = 6;
        //int b = 6;

        //System.out.println(++a); // a should be printed as per order -> increment a and then fetch value -> ans = 7
        //System.out.println(b++); // b -> print value of b and then in increment of b -> b = 6

        // Pre increment -> increment first and then use value
        //int a = 5;
        //int b = ++a;
        /*
        a += 1
        b = a
         */

        // Post increment -> use valur then increment
        //int a = 5;
        // int b = a++;
        /*
        b = a++
        b = a
        a +=1
         */

        // home work problem
        int a = 5;
        int b = (++a) + (a++);
        /*
        ++a -> 6
        a++ -> 7 // here a is now 6 and hence after a++ , a-> 7 but use a = 6 as it is a post operator(use value then increment)
        so, b = 6 + 6 = 12
         */
        System.out.println(b);
    }
}
