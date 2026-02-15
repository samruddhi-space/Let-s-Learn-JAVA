package DaySix;

     // Default / non- parametric construction practice
//    public class Mydate{
//
//        int date;
//        String month;
//        int year;
//
//        Mydate(){
//            date = 1;
//            month = "January";
//            year = 1970;
//        }
//
//        public static void main(String[] args)
//        {
//
//            Mydate d = new Mydate();
//
//            System.out.println("date :"+d.date);
//            System.out.println("month :"+d.month);
//            System.out.println("year :"+d.year);
//
//        }
//    }
//


//  1 - Parametric Constructor

//public class Mydate{
//    int date;
//    String month;
//    int year;
//
//    Mydate(int d){
//        date = d;
//        month = "January";
//        year = 1970;
//    }
//
//    public static void main(String[] args)
//    {
//
//        Mydate d = new Mydate( 8);
//
//        System.out.println("date :"+d.date);
//        System.out.println("month :"+d.month);
//        System.out.println("year :"+d.year);
//
//    }
//}



// 2 - parametric constructor

public class Mydate{
    int date;
    String month;
    int year;

    Mydate(int d, String m){
        date = d;
        month = m;
        year = 1970;
    }

    public static void main(String[] args)
    {

        Mydate d = new Mydate(8,"October");

        System.out.println("date :"+d.date);
        System.out.println("month :"+d.month);
        System.out.println("year :"+d.year);

    }
}
