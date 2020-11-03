package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();
      /*  ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al = new ArrayList<String>();*/
        al.add("sagram");
        al.add("amol");
        al.add("dhanashree");
        al.add("lalita");
        al.add("shilpa");
        al.add("shilpa");

       /* al.add(89);
        al.add('b');*/ // not allowd

        System.out.println(al);

        // for each -- also use to print array

        System.out.println("-- using for each loop ---");
        for(String str:al)
        {
            System.out.println(str);
        }


        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(34);
        al2.add(14);
        al2.add(44);
        al2.add(36);
        al2.add(94);

        System.out.println(al2);

        System.out.println("-- using for each loop ---");

        for(int i:al2)
            System.out.println(i);

    }
}
