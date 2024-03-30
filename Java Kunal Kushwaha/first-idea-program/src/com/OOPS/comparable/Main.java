package comparable;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Student prem = new Student(21, 99.92f);
        Student aryan = new Student(23, 89.34f);
        Student vikky = new Student(13, 59.34f);
        Student pinky = new Student(33, 49.34f);
        Student cheeky = new Student(3, 99.34f);
        Student milky = new Student(2, 39.34f);
        Student orka = new Student(12, 69.34f);
        Student xyz = new Student(45, 79.34f);
        Student lbw = new Student(53, 85.34f);
        Student clean = new Student(32, 82.44f);
        Student[] list = {prem, aryan, vikky, pinky, cheeky, milky, orka, xyz, lbw, clean};

        System.out.println(Arrays.toString(list));
        // int result = prem.compareTo(aryan);
        // if (result > 0) {
        //     System.out.println("prem has more marks");
        // } else if (result == 0) {
        //     System.out.println("both have same marks");

        // } else {
        //     System.out.println("Aryan has more marks");
        // }
    }
}

class Student implements Comparable<Student>{
    public int rollNo;
    public float marks;

    Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks-o.marks); 
        return diff;
    }
    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

}


