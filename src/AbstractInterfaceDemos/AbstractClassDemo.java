package AbstractInterfaceDemos;

public abstract class AbstractClassDemo {

    abstract void run();
    abstract void start();

     void display() // non abstract / concrete method
    {
        System.out.println("this is display");
    }


}

class ChildAbstract extends  AbstractClassDemo
{


    void run() {
        System.out.println("run");
    }

    void start()
    {
        System.out.println("start");
    }

    public static void main(String[] args) {
        AbstractClassDemo ob = new ChildAbstract();
        ob.run();
        ob.start();
        ob.display();

    }
}
