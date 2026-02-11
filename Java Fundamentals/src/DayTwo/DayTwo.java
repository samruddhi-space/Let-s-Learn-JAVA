package DayTwo;

public class DayTwo {
    public static void main(String []args){
        //Day Two work
        // Conversion and casting
        byte b;
        b = 124;
        int a = b ; // converting byte to int is possible but not vice versa as int = 4 bytes
        System.out.println(a);

        int k = 76;
        byte v = (byte)k;// used concept of casting
        System.out.println(v);

        float f = 5.6f;
        int j = (int)f;// used concept of casting
        System.out.println(j);

        int i = 8;
        float f_1 = (float)i;// used concept of casting
        System.out.println(f_1);

        //type conversion in multiplication
        byte q = 20;
        byte w = 40;

        System.out.println(q*w);
        /* here the ans is over the limit
         of byte but print the result without storing the result in int type variable how ?*/

    }
}
