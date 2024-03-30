import java.util.*;
public class VarArgsInFunctionOverloading {
    public static void main(String[] args) {
        //demo(); //Ambigouity because now compiler cant decide which function to run
        //- if we are providing no inputs in case of function overloading
    }

    static void demo (int ...v) {
    System.out.println(Arrays.toString(v));
     }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }
}