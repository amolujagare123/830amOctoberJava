package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("sagram");
        al.add("amol");
        al.add("dhanashree");
        al.add("lalita");
        al.add("shilpa");

        System.out.println("al:"+al);

        ArrayList<String> al2  = new ArrayList<>();

        System.out.println("al2:"+al2);

        al2.addAll(al);

        System.out.println("al2:"+al2);

    }
}
