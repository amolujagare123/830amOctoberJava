package Methods;

public class FinalVariableDemo {

    final  int speed = 60;

    void change()
    {
       // speed = 100;
    }

    public static void main(String[] args) {
        FinalVariableDemo ob = new FinalVariableDemo();

        System.out.println(ob.speed);

        ob.change();

        System.out.println(ob.speed);
    }
}
