package ExceptionDemo;

public class ArrrayExample {

    public static void main(String[] args) {

        int[] a = new int[3];

        System.out.println(a.length);

        try {

            a[0] = 12;
            a[1] = 13;
            a[2] = 15;
            a[3] = 17;
        }
        catch(Exception e)
        {
            System.out.println("inside the catch");
        }


        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);

        System.out.println("End of the program");


    }
}
