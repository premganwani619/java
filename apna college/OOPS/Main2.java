class Student {
    String name;
    int age;

    Student() {
        // non parameterzed constructor
        //
    }

    Student(Student s) {// parameterized constructor
        this.name = s.name;
        this.age = s.age;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void printInfo() {
        System.out.println("Name is " + this.name +
                " and age is " + this.age);
    }
}

public class Main2 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "prem";
        s1.age = 21;
        s1.printInfo();
        Student s2 = new Student(s1);
        s2.printInfo();
        Student s3 = new Student("Nikky",20);
        s3.printInfo();
        Student s4 = new Student(s3);
        s4.printInfo();


    }
}
