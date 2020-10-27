package ExceptionDemo;

public class NumberRange {

    void checkRange(int i)
    // number must be in between 1 to 10
    // if it is not the stop the program execution , with some exception
    {
        if(i>=1 && i<=10)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {

        int a = 4;

        NumberRange ob = new NumberRange();

        ob.checkRange(11);

        System.out.println("End of the program");

    }



}
