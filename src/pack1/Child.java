package pack1;


import StaticDemos.StaticMethoddemo;
import classes.ParentClass;

public class Child extends ParentClass {
    int iChild;

    void dispChild() {
        System.out.println("dispChild()");
    }


    public static void main(String[] args) {

        Child ob = new Child();

        ob.iChild = 90;
        ob.dispChild();

        ob.iParent = 19;
      //  ob.dispParent();



        ParentClass ob1 = new ParentClass();

      //  ob1.iParent = 19;

        StaticMethoddemo.myMethod();

    }
}