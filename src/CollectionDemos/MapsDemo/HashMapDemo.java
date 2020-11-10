package CollectionDemos.MapsDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(101,"amol");
        hm.put(342,"shilpa");
        hm.put(601,"lalita");
        hm.put(111,"Dhanashree");

        hm.put(11.1,"Dhanashree");
        hm.put('v',123);
        hm.put(111,12.5);


        System.out.println(hm.put(201,"Sangram"));
        System.out.println(hm.put(201,"xyz"));

        hm.put(112,"amol");

        hm.put(1,null);

        hm.put(2,null);

        hm.put(3,null);

        hm.put(null,"xyz");

        hm.put(null,"abc");

        System.out.println(hm);
    }
}
