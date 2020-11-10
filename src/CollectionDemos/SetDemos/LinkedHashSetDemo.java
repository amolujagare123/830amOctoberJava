package CollectionDemos.SetDemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet hs = new LinkedHashSet();

        hs.add("sagram");
        hs.add("amol");
        hs.add("dhanashree");
        hs.add("lalita");
        hs.add("shilpa");
        hs.add(null);
        hs.add(12);
        hs.add(23.5);
        hs.add('g');
        hs.add(true);


        System.out.println( hs.add("shilpa"));

        System.out.println(hs);

    }
}
