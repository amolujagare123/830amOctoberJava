package StaticDemos;

public class StaticMethoddemo {

    static int i =10;

    static void display()
    {
        System.out.println( "display");
    }

    public static void myMethod()
    {
        System.out.println("my method");
        System.out.println("i"+i); // static
        display(); // static
    }

    public static void main(String[] args) {
/*
        StaticMethoddemo ob = new StaticMethoddemo();

        ob.myMethod();*/

        StaticMethoddemo.myMethod();
    }
}
