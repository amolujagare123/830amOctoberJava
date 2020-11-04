package CollectionDemos.LinkedListDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("sagram");
        ll.add("amol");
        ll.add("dhanashree");
        ll.add("lalita");
        ll.add("shilpa");

        System.out.println(ll);

        ll.addFirst("fisrt");
        ll.addLast("last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }

}
