package DayNine;

//SINGLE INHERITANCE

public class Animal {
    String name;
    void eat(){
        System.out.println("Can eat");

    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.name = "Tommy";//Since name is available through inheritance from Animal, the dog object can directly access it.
        d.display();
    }

}
class Dog extends Animal{
    void display(){
        System.out.println(name);

    }

}

