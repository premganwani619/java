public class Shadowing {
    static int x = 90; // this will be shadowed 
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x;//the class variable is shadowed

       // System.out.println(x); // scope will begin when value is initialized
       x=40;
       System.out.println(x);//40
        fun();
         }
        static void fun() {
        System.out.println(x);
        }
}
//Shwdowing is a practise in java where we use two variables with the same name
//within the scope that overlaps
//In shadowing the higher level scope variable gets overlapped with the variable of scope of lower level