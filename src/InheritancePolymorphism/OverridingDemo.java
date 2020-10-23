package InheritancePolymorphism;

public class OverridingDemo {

     void mymethod()
    {
        System.out.println("my method");
    }

}


class  ChildClass extends  OverridingDemo
{
   void mymethod()
    {
        System.out.println("my method child");
    }
}
