package StaticDemos;

public class Counter {

    static int count = 0; // 1 ,2

    Counter()
    {
        count++;
        System.out.println(count); // 1 ,2 ,3

    }

    public static void main(String[] args) {

        Counter ob1 = new Counter();//
        Counter ob2 = new Counter();//
        Counter ob3 = new Counter();//

    }

}
