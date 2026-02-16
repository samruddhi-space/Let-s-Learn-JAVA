package DaySix;

class student{
    int roll ;
    String name ;
    int mark1, mark2, mark3;

    student(int r, String n, int m1, int m2 , int m3){
        roll = r;
        name = n;
        mark1= m1;
        mark2= m2;
        mark3=m3;
    }

    double avg(){
        return(mark1+mark2+mark3)/3.0;
    }
    void display(){
        System.out.println("roll no :"+roll);
        System.out.println("name :"+name);
        System.out.println("average :"+avg());
    }

    public static void main(String[]args){
        student s1 = new student(1,"sam",20, 21,22);
        student s2 = new student(2, "neha", 30,31,32);

        if (s1.avg()> s2.avg()){
            s1.display();
        }
        else{
            s2.display();
        }
    }


}