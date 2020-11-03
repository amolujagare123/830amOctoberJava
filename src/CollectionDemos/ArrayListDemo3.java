package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        System.out.println(al.isEmpty()); // true

        al.add("sagram");
        al.add("amol");
        al.add("dhanashree");
        al.add("lalita");
        al.add("shilpa");
        al.add("shilpa");
        System.out.println(al.isEmpty());// false

        System.out.println(al);

        al.set(4,"priyanka");

        System.out.println(al);

        al.remove(3); // using index
        al.remove("amol"); // using object

        System.out.println(al);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(34);
        al2.add(14);
        al2.add(44);
        al2.add(36);
        al2.add(94);


        System.out.println(al2);


       // al2.remove(36); // it can create a problem
        al2.remove(new Integer(36)); // convert int into Integer obhect

        System.out.println(al2);


        /*al.clear();
        System.out.println(al);

        System.out.println(al.isEmpty());//true*/

    }
}
