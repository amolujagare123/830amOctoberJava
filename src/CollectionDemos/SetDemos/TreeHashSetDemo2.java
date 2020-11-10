package CollectionDemos.SetDemos;

import java.util.TreeSet;

public class TreeHashSetDemo2 {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(23);
        ts.add(13);
        ts.add(31);
        ts.add(123);
        ts.add(231);
        ts.add(423);
        ts.add(203);
        ts.add(2);

        System.out.println(ts);
        
        System.out.println(ts.first());
        System.out.println(ts.last());

        System.out.println(ts.headSet(123)); // 123 is not inclusive (all elements less than 123 printed)

        System.out.println(ts.tailSet(123));//123 is inclusive (all elements greater than 123 printed)

        System.out.println(ts.subSet(13,203));
// 13 is inclusive 203 is not inclusive
        // number between these two calues are printed



    }
}
