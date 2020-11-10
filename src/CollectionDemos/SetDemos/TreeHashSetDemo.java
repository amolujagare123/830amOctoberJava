package CollectionDemos.SetDemos;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeHashSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("sagram");
        ts.add("amol");
        ts.add("dhanashree");
        ts.add("lalita");
        ts.add("shilpa");
      //  hs.add(null);
       /* hs.add(12);
        hs.add(23.5);
        hs.add('g');
        hs.add(true);*/


        System.out.println( ts.add("shilpa"));

        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());




    }
}
