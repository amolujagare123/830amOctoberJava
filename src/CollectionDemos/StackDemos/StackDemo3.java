package CollectionDemos.StackDemos;

import java.util.Stack;

public class StackDemo3 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("abc1");
        s.push("abc2");
        s.push("abc3");
        s.push("abc4");
        s.push("abc5");

        System.out.println(s);

        System.out.println(s.search("amol"));

        System.out.println(s.search("abc4"));



    }
}
