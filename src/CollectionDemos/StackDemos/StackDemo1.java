package CollectionDemos.StackDemos;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("abc1");
        s.push("abc2");
        s.push("abc3");
        s.push("abc4");
        s.push("abc5");

        System.out.println(s);

        System.out.println(s.pop());
        // removes the element but also it returns the removed element

        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        System.out.println("now there are no elements");

        System.out.println(s.pop()); //returns an exception if stack is empty
    }
}
