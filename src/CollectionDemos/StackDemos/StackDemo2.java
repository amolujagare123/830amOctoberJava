package CollectionDemos.StackDemos;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        System.out.println("When stack is empty");
        System.out.println(s.empty()); //true

        // it thows an exception

       // System.out.println(s.peek());

        s.push("abc1");
        s.push("abc2");
        s.push("abc3");
        s.push("abc4");
        s.push("abc5");

        System.out.println(s);

        System.out.println(s.peek());

        System.out.println(s);


        System.out.println(s.empty()); //false
    }
}
