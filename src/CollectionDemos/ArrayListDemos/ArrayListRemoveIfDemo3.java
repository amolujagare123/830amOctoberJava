package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo3 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();

        al.add(12);
        al.add(54);
        al.add(21);
        al.add(11);
        al.add(65);

        System.out.println(al);
        // remove all the odd number elements
        // a % 2!=0

        // al.removeIf(variableName of type that is the type of list -> condition)
       // -> predicate Symbol
        al.removeIf(a -> a % 2 !=0);
        System.out.println(al);

    }
}
