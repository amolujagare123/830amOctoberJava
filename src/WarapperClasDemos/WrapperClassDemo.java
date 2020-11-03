package WarapperClasDemos;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i = 5;
        Integer ii = new Integer(5); // boxing / wrapping
        ii = new Integer(i); // boxing / wrapping

        Integer ii1 = 5 ;  // autoboxing / autowrapping

        int i1 = ii.intValue(); // unboxing / unwrapping

        i1 = ii; // autounboxing / autounwrapping

       // ------------------------------------------------------
        double d = 34.6;

        Double dd = new Double(d); // boxing / wrapping
        Double dd1 = d ; // autoboxing / autowrapping
        System.out.println(dd);

        double d1 = dd.doubleValue(); // unboxing / unwrapping
        double d2 = d;  // autounboxing / autounwrapping




    }
}
