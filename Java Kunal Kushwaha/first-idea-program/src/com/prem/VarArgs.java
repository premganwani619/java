import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun ();
        multiple ( 2,  3,  "Kunal", "Rahul", "dvytsbhusc");
        }

    static void multiple(int a, int b, String... v) {
        //if there is combination of normal args + variable length args
        //the varargs should be at last
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}