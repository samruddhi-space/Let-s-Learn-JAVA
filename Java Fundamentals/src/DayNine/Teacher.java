package DayNine;

public class Teacher {
    private String designation;
    String collegeName;

    // by default" public "as a access specifier

    //getter -> returns the value of the variable -> used to get or return a specific value or text
    String getDesignation() {
        return designation;
    }

    //setter -> stes / updates the variable value -> used to take value and store it
    void setDesignation(String d) {
        designation = d;
    }



    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setDesignation("Lab Assistant");
        t.setDesignation("Assistant Professor");
        t.setDesignation("Professor");
        t.setDesignation("HOD");

        System.out.println(t.getDesignation());

        PhysicsTeacher p = new PhysicsTeacher();
        p.setnumOfExperiments(5);
        System.out.println(p.getnumOfExperiments());

        MusicTeacher m = new MusicTeacher();
        m.setinstrumentName("Piano");
        System.out.println(m.getinstrumentName());

        MathTeacher mt = new MathTeacher();
        mt.setformulaNum(1);
        System.out.println(mt.getformulaNum());
    }
}

class PhysicsTeacher extends Teacher {
    private int numOfExperiments;

    void setnumOfExperiments(int n) {
        numOfExperiments = n;
    }
    int getnumOfExperiments() {
        return numOfExperiments;
    }
}

class MusicTeacher extends Teacher {
    private String instrumentName;

    void setinstrumentName(String n) {
        instrumentName = n;
    }
    String getinstrumentName() {
        return instrumentName;
    }
}

class MathTeacher extends Teacher {
    private int formulaNum;

    void setformulaNum(int n) {
        formulaNum = n;
    }
    int getformulaNum() {
        return formulaNum;
    }
}


