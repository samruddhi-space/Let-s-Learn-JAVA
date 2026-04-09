package DayEleven;

// Inheritance -> using Interfaces
//implements keyword is used whenever there is compulsion on use of interface (methods in interface)
// Diff bet "extends" vs "implements" ->
//    extends -> used when child class inherits methods/ attributs from parent class
//    implements - > used when a class is using attributes or methods from a another class (parent class) and
//    it is mandatory to use these methods inside the interface

// java.awt.geom.Area;

public class Shape {
    String name;
    Shape(){// constructor -> for assigning values
    }
    String getName(){ // as per the Q shape method should have getName mathod
        return name;
    }
}

// Creating interfaces
interface Area{// here created a interface with using keyword "interface"
    public double area();// in the interface we created returnType and method name which should be done whenever the interface is implemented
}
interface Volume{
    public double volume();
}

class Circle extends Shape implements Area {
    double radius;
    Circle(){}
    Circle(double r , String n){
        radius = r ;
        name = n;// constructor -> for assigning values
    }

    public double area(){// mathod for calculation
        return Math.PI * (radius * radius);
    }
}

class Square extends Shape implements Area {
    double side;
    Square(){}
    Square(double s, String n) {
        // inside constructor it will assign parameter s to value of side
        side = s;
        name = n;
    }

    public double area() {
        return side * side;
    }
}

class Cube extends Square implements Volume{
    Cube(double s , String n){
        side = s;
        name = n;
    }
    public double volume(){
        return side*side*side;
    }
}

class Sphere extends Circle implements Volume{
    Sphere(double r, String n) {
        radius = r;
        name = n;
    }
    public double volume(){
        return (1.3334) * Math.PI * radius * radius * radius;
    }
}

class Cylinder extends Circle implements Volume {
    // volume of cylinder -> Pi * r* r* h
    double height;
    Cylinder(double h , double r , String n) {
        height = h;
        radius = r;
        name = n;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Glome extends Circle implements Volume {
    Glome(double r, String n) {
        radius = r;
        name = n;
    }


    public double volume() {
        //area of gloom = 0.5 * (Math.PI) * (Math.PI) * r * r * r * r ;
        return 0.5 * (Math.PI) * (Math.PI) * radius * radius * radius * radius;
    }
}

class TestShape{
    public static void main(String[] args){
        Circle c = new Circle (2,"Circle");
        System.out.println("Area Of Circle is : "+c.area());
        System.out.println("Name Of Shape is : "+c.getName());

        Square s = new Square (4,"Square");
        System.out.println("Area Of Square is : "+s.area());
        System.out.println("Name Of Shape is : "+s.getName());

        Cube cb = new Cube (2,"Cube");
        System.out.println("Volume Of Cube is : "+cb.volume());
        System.out.println("Name Of Shape is : "+cb.getName());

        Cylinder cy = new Cylinder (6,2,"Cylinder");
        System.out.println("Volume Of Cylinder is : "+cy.volume());
        System.out.println("Name Of Shape is : "+cy.getName());

        Sphere sp = new Sphere (2,"Sphere");
        System.out.println("Volume Of Sphere is : "+sp.volume());
        System.out.println("Name Of Shape is : "+sp.getName());

        Glome g = new Glome (2,"Glome");
        System.out.println("Volume Of Glome is : "+g.volume());
        System.out.println("Name Of Shape is : "+g.getName());
    }
}

