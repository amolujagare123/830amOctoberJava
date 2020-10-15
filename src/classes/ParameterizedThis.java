package classes;

public class ParameterizedThis {

    int a;
    double d;
    char c;
    String str;

    ParameterizedThis(int a,double d , char c, String str)
    {
        this.a  = a;
        this.d  = d;
        this.c  = c;
        this.str= str;
    }

    ParameterizedThis() // constructor overloading
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

        ParameterizedThis ob =new ParameterizedThis(45,56.6,'j',"dsds");
        ob.display();


    }
}
