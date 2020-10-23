package Methods;

public class FinalmethodDemo {

    /*final*/ void mymethod()
    {
        System.out.println("my method");
    }
}

class Child extends FinalmethodDemo
{
    void mymethod() // overriden method
    {
        System.out.println("my method in child");
    }
}
