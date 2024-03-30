public class Main {
    public static class Student {
        int rollNo;
        String name;

        Student(Student other) {
            this.rollNo = other.rollNo;
            this.name = other.name;
        }
        Student(){
            this(21,"default name");
        }

        Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student other = new Student(21, "Prem");
        System.out.println(other.name);
        System.out.println(other.rollNo);
        Student prem= new Student(other);
        System.out.println(prem.name);
        System.out.println(prem.rollNo);
        Student student1 = prem;
        student1.name="student1";
        System.out.println(prem.name);
    }
}