package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();

        al.add(12);
        al.add(54);
        al.add(21);
        al.add(11);
        al.add(65);

        System.out.println(al);
        // remove all the  elements which are less than 20
        // a <20

        // al.removeIf(variableName of type that is the type of list -> condition)
       // -> predicate Symbol
        al.removeIf(a -> a< 20);
        System.out.println(al);

    }
}
