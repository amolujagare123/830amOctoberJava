package classes;

public class ClassDemo2 {

    int a;
    double d;
    char c;
    String str;

    /*ClassDemo2()
    {

             // no body written
          // empty constructor

    }*/

    ClassDemo2()
    {
        a =10;
        d =1.1;
        c='a';
        str="lalita";
    }


    void display()
    {

        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        ClassDemo2 ob = new ClassDemo2();
        /*ob.a =20;
        ob.d=56.7;
        ob.c = 'g';
        ob.str="amol";*/

        ob.display();

    }
}
