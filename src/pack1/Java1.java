package pack1;

import Methods.RetuningValues;

import static StaticDemos.StaticMethoddemo.*;


public class Java1 {

    public  int a1;
   public double d1;
    public char c1;
    public String str1;


    public void display1() {
        System.out.println("a=" + a1);
        System.out.println("d=" + d1);
        System.out.println("c=" + c1);
        System.out.println("str=" + str1);
    }


    public static void main(String[] args) {

        Java1 ob = new Java1();
        ob.d1 = 56.5;
        ob.a1 = 67;
        ob.c1 ='g';


        RetuningValues retuningValues = new RetuningValues();

        Java1 object = retuningValues.getObject();

        object.display1();


        myMethod();


    }

}
