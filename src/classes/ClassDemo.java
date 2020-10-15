package classes;

public class ClassDemo {

    int a;
    double d;
    char c;
    String str;


    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }


    public static void main(String[] args) {

        /*int x =10;
        System.out.println(x);
*/
        ClassDemo ob = new ClassDemo();
        ob.a =20;
        ob.d=56.7;
        ob.c = 'g';
        ob.str="amol";

        ob.display();


        ClassDemo ob1 = new ClassDemo();

        ob1.a = 78;
        ob1.d=45.6;
        ob1.c ='s';
        ob1.str="dhanashree";

        ob1.display();


        // float f = 1243.5f;

        //System.out.println(ob.a);
    }

}