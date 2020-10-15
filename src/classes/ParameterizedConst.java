package classes;

public class ParameterizedConst {

    int a;
    double d;
    char c;
    String str;



    ParameterizedConst(int x,double y , char z, String s)
    {
        a =x;
        d =y;
        c=z;
        str=s;
    }

    ParameterizedConst() // constructor overloading
    {

    }

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        ParameterizedConst ob =new ParameterizedConst(45,56.6,'j',"dsds");
        ob.display();


        ParameterizedConst ob1 =new ParameterizedConst();
        ob1.display();
    }
}
