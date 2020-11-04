package CollectionDemos.ArrayListDemos;

import java.util.ArrayList;

public class ArrayListRemoveIfDemo1 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList();

        al.add("sagram");
        al.add("amol");
        al.add("dhanashree");
        al.add("lalita");
        al.add("shilpa");

        System.out.println(al);

        // remove all the elements which starts with 's'
        // str.startsWith("s") - retruns true if the string start with "s"

        // al.removeIf(variableName of type that is the type of list -> condition)
       // -> predicate Symbol
        al.removeIf(str -> str.startsWith("s"));

        System.out.println(al);




    }
}
