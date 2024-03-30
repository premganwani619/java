class Student {
    String name;
    int age;
    

    public void printInfo(String name) {
        System.out.println("Name is " + this.name);
    }
    public void printInfo(int age) {
        System.out.println("Age is " + this.age);
    }
    public void printInfo(String name,int age) {
        System.out.println("Name is " + this.name +
                " and age is " + this.age);
    }
}
//Polymorphism is of two type
//compile time->function overloading
//run time->function overriding
public class FunctionOverloading {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "prem";
        s1.age = 21;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
        


    }
}
