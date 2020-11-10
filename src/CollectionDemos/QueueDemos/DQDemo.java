package CollectionDemos.QueueDemos;

import java.util.ArrayDeque;

public class DQDemo {

    public static void main(String[] args) {

        ArrayDeque<String> adq = new ArrayDeque<>();

        adq.offer("sagram");
        adq.offer("amol");
        adq.offer("dhanashree");
        adq.offer("lalita");
        adq.offer("shilpa");

        System.out.println(adq);

        adq.offerFirst("first");
        adq.offerLast("last");

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);


    }
    
}
