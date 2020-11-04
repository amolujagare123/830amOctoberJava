package CollectionDemos.VectorDemos;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("sagram");
        v.add("amol");
        v.add("dhanashree");
        v.add("lalita");
        v.add("shilpa");

        System.out.println(v);


       /* Object[] objArr = v.toArray();

        for(int i=0;i<objArr.length;i++)
        {
            System.out.println(objArr[i]);
        }*/

        System.out.println("Using iterator");
        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        System.out.println("Using enumeration");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());


    }
}
