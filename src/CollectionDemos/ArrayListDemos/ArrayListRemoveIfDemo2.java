package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("sagram");
        al.add("amol");
        al.add("dhanashree");
        al.add("lalita");
        al.add("shilpa");

        System.out.println(al);

        // remove all the elements which length = 6 starts with 's'
        // str.length() == 6

        // al.removeIf(variableName of type that is the type of list -> condition)
       // -> predicate Symbol
        al.removeIf(str -> str.length()==6);
        System.out.println(al);

    }
}
