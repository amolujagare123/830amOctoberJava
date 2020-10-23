package StaticDemos;

public class Student {

    int rno;
    String name;
    static String college;

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);

    }

    public static void main(String[] args) {

        Student ob1 = new Student();

        ob1.rno = 1;
        ob1.name ="lalita";
       // ob1.college = "Abc";

        Student ob2 = new Student();

        ob2.rno = 2;
        ob2.name ="Dhanashri";
        //ob2.college = "PICT";

        Student.college = "nagar college";


        ob1.display(); // college = ??
        ob2.display(); // college = ??


    }
}
