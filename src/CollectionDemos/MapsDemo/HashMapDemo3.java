package CollectionDemos.MapsDemo;

import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        System.out.println(hm.isEmpty()); // true

        hm.put(101,"amol");
        hm.put(342,"shilpa");
        hm.put(601,"lalita");
        hm.put(111,"Dhanashree");
        hm.put(112,"Sagram");
        System.out.println(hm.isEmpty()); // false
        System.out.println("hm:"+hm);

        System.out.println(hm.get(342));

        hm.remove(342);

        System.out.println("hm:"+hm);

        System.out.println(hm.containsKey(342));
        System.out.println(hm.containsKey(111));

        System.out.println(hm.containsValue("shilpa"));
        System.out.println(hm.containsValue("amol"));

        System.out.println(hm.size());


        hm.clear();
        System.out.println("after clear");
        System.out.println("hm:"+hm);

    }
}
