package CollectionDemos.MapsDemo;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(101,"amol");
        hm.put(342,"shilpa");
        hm.put(601,"lalita");
        hm.put(111,"Dhanashree");
        hm.put(112,"Sagram");

        System.out.println("hm:"+hm);

        HashMap hm1 = new HashMap();

        System.out.println("hm1:"+hm1);

        hm1.putAll(hm);

        System.out.println("hm1:"+hm1);
    }
}
