package AbstractInterfaceDemos;

public interface MyInterFace1 {


    void run(); // all the abstract methods are public by default
    void  start();
    void display();


    default  void show()
    {
        System.out.println("show");
    }
}

interface AnotherInterface
{
    void display();

}


class ChildInterface1 implements MyInterFace1,AnotherInterface
{
    public void run()  // overriding the method , scope cant be decrease
    {
        System.out.println("run");
    }

    public void start()
    {
        System.out.println("start");
    }

    public void display()
    {
        System.out.println("display");
    }

    public static void main(String[] args) {

        MyInterface ob = new ChildInterface();

        ob.run();
        ob.start();

        ob.show();

        ChildInterface1 obj = new ChildInterface1();

        obj.display();


        // using reference we cant call the static members
        // only direct object or class / interface name can call them

    }
}