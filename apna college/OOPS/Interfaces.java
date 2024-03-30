interface Animal {
    void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

class Student {
    static String school;
    String name;
}

public class Interfaces {
    public static void main(String args[]) {

        Student.school = "JMV";
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Meena";
        s2.name = "Beena";

        System.out.println(Student.school);
        //same result can be obtained by
        // System.out.println(s1.school);
        // System.out.println(s2.school);
        
    }
}
/*
 * All the fields in interfaces are public, static and final by default.
 * All methods are public & abstract by default.
 * A class that implements an interface must implement all the methods declared
 * in the interface.
 * Interfaces support the functionality of multiple inheritance.
 */

/*
 * Static Keyword
 * Static can be :
 * Variable (also known as a class variable)
 * Method (also known as a class method)
 * Block
 * Nested class
 */