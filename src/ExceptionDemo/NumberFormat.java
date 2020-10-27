package ExceptionDemo;

public class NumberFormat {

    public static void main(String[] args) {

        int a = 10;
        int b =0;
        int c =1;

        try {
            c = a / b;
        }
        catch (Exception e)
        {
            System.out.println("inside catch");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            e.printStackTrace();
        }

        finally
        {
            System.out.println("inside finally");
        }

        System.out.println("division is = "+c);
        System.out.println("End of the prgram");

    }

}
