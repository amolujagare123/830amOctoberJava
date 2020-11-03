package BasicJava;

public class Factorial {


    public static void main(String[] args) {

        int n =5;

        int multiply = 1;

        for(int i = n ; i>0 ;i--)
        {

            multiply = i * multiply;

        }

        System.out.println(multiply);
    }
}
