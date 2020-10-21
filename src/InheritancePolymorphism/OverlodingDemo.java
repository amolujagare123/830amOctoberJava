package InheritancePolymorphism;

public class OverlodingDemo {


    int a;
    int b;

    void addition()
    {
        int c = a+b;
        System.out.println("addition="+c);
    }

    void addition(int a , int b)
    {
        int c = a+b;
        System.out.println("addition="+c);
    }

    void addition(int a,int b, int c)
    {
        int add = a+b+c;
        System.out.println("addition="+add);
    }


    void addition(double a , double b)
    {
        double c = a+b;
        System.out.println("addition="+c);
    }

    void addition(String s1,String s2)
    {
        String add = s1 + s2 ;
        System.out.println("addition="+add);
    }

    public static void main(String[] args) {

        OverlodingDemo ob = new OverlodingDemo();

        ob.a = 11;
        ob.b = 22;

        ob.addition();

        ob.addition(12,45);

        ob.addition(12,12,12);

        ob.addition(12.45,56.2);

        ob.addition("java","Selenium");

    }

}
