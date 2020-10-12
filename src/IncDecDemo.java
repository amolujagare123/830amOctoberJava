public class IncDecDemo {

    public static void main(String[] args) {

        int i =10;
        System.out.println("-- increment operation -----");
       System.out.println(i);// 10 - correct

        System.out.println(i++);// 10

        System.out.println(i);// 11 - correct

        System.out.println(++i);// 12 - correct

        System.out.println(i);// 12 - correct

        /*i++; //---- '++' unary operator
        first the statement will execute then the increment by one

        ++i;
        first the increment by one then  the statement will execute */

        i =10;
        System.out.println("-- decrement operation -----");

        System.out.println(i);//  10

        System.out.println(i--);// 10

        System.out.println(i);// 9

        System.out.println(--i);// 8

        System.out.println(i);// 8


    }
}
