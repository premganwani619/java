abstract class Animal {
    abstract void walk();
    //Abstract class can have both type of methods abstract or non abstacts we can create constroctors
    //aur also we can create static methods
    //we cant create object of abstract class
    Animal(){
        System.out.println("Animal object created");
        //Whenever we create object of Derived class the constructor of base class gets executed first and
        //then the base class constructor gets called
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walking on 4 legs");
    }
    Horse(){
        System.out.println("Horse object created");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walking on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();
        // Animal animal = new Animal();It will throw run time error

    }
}
