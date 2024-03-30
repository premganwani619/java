//In java we write everything in classes
//Every java file is a class itself
//class in named group of properties and functions
//file name and classname should be same (by convention)
//if classname is diffrent it cant be public
//Classnames should be declared in Pascal notation(By convention)
//execution of a java file starts with main function without it we cant run the program
//packges helps providing rules and etc for ex which file can be accsessed from where
//Every class in java extends Object class
public class Main{
    public static void main(String[] args) {
        System.out.println("prem");
//        float num = 10.764335;
//        System.out.println(num);
        String a="abc";
        String b="abc";
        if (a==b){
            System.out.println("equal");
        }
    }
}
//int num = 300,000,000 will give error
//int num = 300_000_000 will not give error
//float num = 10 -> 10.0
//float num = 10.764335 -> lossy

//Type conversion is implicit
//if one type of data is assigned to another type of variable then automatically type conversion
//will take place if following conditions are met
//1)types are compatible
//2)destination type is greater then source type
//otherwise gives error

//type cast
//if you want to make it explicit use type cast
//int c = (int)43.3;=43

//int a = 257;
//byte c = (byte)a;
// the value of c will be 1 (257%256)

//Automatic type promosion in expressions
//byte a = 50;
//byte b = 40;
//byte c = 100;
//int d = a*b/c; d will get 20

//byte a,b,c will automatically be converted in an expression to integers to store
//and perform the value for the calculation

// byte p = 50
//btye q = 2 * 50 it will give error because in expression the byte is converted into int
//and now you cannot store the int to byte

//int num = 'a' (97)

//java supports unicode it means we can console all the human languages

//type promotion rules in expressions
//first rule the byte short and char will be promoted to int in expression
//second rule if any one of the operand is lond the whole expression will promote to lond
//second rule if any one of the operand is float the whole expression will promote to float
//second rule if any one of the operand is double the whole expression will promote to double

//ex sout(4*48574832.24565432345f)
//floating point error


//byte b = 42;
//char c = 'a';
//short s = 1024;
//int i = 50000;
//float f = 5.67f;
//double d = 0.1234;
//double result = (f * b) + (i / c) - (d - s);
//System.out.println((f* b) + " " + (i / c) + " " + (d - s));
//238.14(promoted to float) 515(promoted to int) -1023.8766(promoted to double)
//(float)+int-double = double
//System.out.println(result);
//1777.0166146484376(promoted to double)
