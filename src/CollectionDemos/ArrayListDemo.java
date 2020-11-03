package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("sagram");
        al.add("amol");
        al.add("dhanashree");
        al.add("lalita");
        al.add("shilpa");
        al.add("shilpa");
        al.add(null);
        al.add(12);
        al.add(23.5);
        al.add('g');
        al.add(true);

       // System.out.println(al);

        // using for loop

        // al.size()
        System.out.println("---- using for loop ---");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("---- using iterator ---");
        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
