package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo5 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList();

        al.add('a');
        al.add('b');
        al.add('c');
        al.add('d');
        al.add('e');
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');
        al.add('j');
        al.add('k');


        System.out.println(al);
        // remove all the  vowels
        // al.removeIf(variableName of type that is the type of list -> condition)
        // -> predicate Symbol
        //  al.removeIf();

        System.out.println(al);

    }
}
