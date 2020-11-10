package CollectionDemos.MapsDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo4 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        System.out.println(hm.isEmpty()); // true

        hm.put(101,"amol");
        hm.put(342,"shilpa");
        hm.put(601,"lalita");
        hm.put(111,"Dhanashree");
        hm.put(112,"Sagram");

        System.out.println("hm:"+hm);

        Set s =  hm.keySet();
        System.out.println("KeySet="+s);

       Collection c =  hm.values();
        System.out.println("Values="+c);

        Set es = hm.entrySet();

        System.out.println("Entry Set:"+es);

    }
}
