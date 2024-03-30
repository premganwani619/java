class Student {
    String name;
    int age;

    Student(String name, int age) {
        System.out.println("Constructor called");
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Name is " + this.name +
                " and age is " + this.age);
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Prem", 24);
        s1.printInfo();

    }
}
