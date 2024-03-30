class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing with "+this.color+" Pen of "+this.type+" type");
    }
}
//this keyword gives the access of current working object's data(properties) and members(methods)
public class Oops {

    public static void main(String args[]) {
        Pen pen1 = new Pen();//Pen() is condtructor of Pen class
        Pen pen2 = new Pen();
        pen1.color = "Blue";
        pen2.color = "Red";
        pen1.type = "Ball";
        pen2.type = "Gel";
        pen1.write();
        pen2.write();
    }
}
//Whenever an object is created, it's always stored in the Heap space and stack memory contains
//the reference to it. Stack memory only contains local primitive variables and reference variables
//to objects in heap space
//constructors are used to construct an object in java
//there are no destructors objects are cleared from heap memory by the garbage collector of java
//constructors functions dont have any return type name of the constructor is same as class name
//For an object constructor can be called only a single time when a object gets created
//Java automatically creates an non parameterized constructor for the class if we dont create