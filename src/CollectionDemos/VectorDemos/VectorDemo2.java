package CollectionDemos.VectorDemos;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(5,2);
        // default initial capacity of 10
        System.out.println("capacity:"+v.capacity()); // 10
        System.out.println("size:"+v.size()); //0

        v.add("sagram");
        v.add("amol");
        v.add("dhanashree");
        v.add("lalita");
        v.add("shilpa");
        v.add("shilpa");

        System.out.println("capacity:"+v.capacity()); //
        System.out.println("size:"+v.size()); // 6

        System.out.println(v);


    }
}
