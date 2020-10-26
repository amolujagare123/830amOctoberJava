package AbstractInterfaceDemos;

public interface MyInterface {
    void run(); // all the abstract methods are public by default
    void  start();
    static void display()
    // if you want to write a concrete method it must be either
    // default or static
    {
        System.out.println("display");
    }

    default  void show()
    {
        System.out.println("show");
    }
}
class ChildInterface implements MyInterface
{
    public void run()  // overriding the method , scope cant be decrease
        {
            System.out.println("run");
        }

    public void start()
    {
        System.out.println("start");
    }


    public static void main(String[] args) {

        MyInterface ob = new ChildInterface();

        ob.run();
        ob.start();

        ob.show();

        MyInterface.display();
        // using reference we cant call the static members
        // only direct object or class / interface name can call them

    }
}
