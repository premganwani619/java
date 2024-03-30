public class InnerClassesExample {
    class Test{//inner classes can be static/non static because they are dependent on upper class
//but if inner class is not static we cant create object of it in static function
    }
}
//if you have two classes the outer one can not be static
//because outer classes are not dependent in any class
//because we declare the things static that we want to be common for all/not dependent on object, inside a class
//that's why we cant declare the outer class static