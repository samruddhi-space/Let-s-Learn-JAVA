package DaySeven;

public class MyDate {

    int date;
    String month;
    int year;

    // default constructor with fixed or default values for attributes
    // constructor name must be same as main class / parent class name
    MyDate() {
        date = 1;
        month = "January";
        year = 1970;
    }

    //constructor with 1 parameter
    MyDate(int d) {
        date = d;
        month = "January";
        year = 1970;
    }

    // constructor with parameters
    MyDate(int d, String m) {
        date = d;
        month = m;
        year = 1970;
    }

    //constructor with 3 parameters
    MyDate(int d, String m, int y) {
        date = d;
        month = m;
        year = y;
    }

    //to print or display output from constructor whenever this func is called
    void display() {
        System.out.println(date + " " + month + " " + year);
    }
} // end of class MyDate

class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        MyDate d1 = new MyDate(); // d1 is obj created for constructor
        MyDate d2 = new MyDate(15);// data is provided to d i.e. 15
        MyDate d3 = new MyDate(20, "March");// data supplu for m
        MyDate d4 = new MyDate(10, "August", 2026);

        d1.display();//for obj d1 display func is being called
        d2.display();
        d3.display();
        d4.display();
    }

}
