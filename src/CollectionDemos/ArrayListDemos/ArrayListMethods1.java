package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("sagram");
        al.add("amol");
        al.add("dhanashree");
        al.add("lalita");
        al.add("shilpa");

        System.out.println("al:"+al);

        ArrayList<String> al1  = new ArrayList<>();

        al1.add("sagram");
        al1.add("amol");
        al1.add("dhanashree");
        al1.add("abc1");
        al1.add("abc2");
        al1.add("abc3");

        System.out.println("al1:"+al1);

        al1.removeAll(al);

        System.out.println("al1:"+al1);
    }
}
