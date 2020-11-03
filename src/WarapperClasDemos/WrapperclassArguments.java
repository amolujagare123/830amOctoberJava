package WarapperClasDemos;

public class WrapperclassArguments {

    public static void main(String[] args) {

        Integer i1 = new Integer(45); // Integer as an argument
        System.out.println(i1);

        Integer i2 = new Integer("45"); // string as an argument
        System.out.println(i2);

        Double d1 = new Double(34.6); // double as an argument
        Double d2 = new Double(34.6f); // float as an argument
        Double d3 = new Double("34.6");  // string as an argument

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");

        Character c1 = new Character('c');
       // Character c2 = new Character("c");


    }
}
