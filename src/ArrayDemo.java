public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 56;
        a[1] = 45;
        a[2] = 67;
        a[3] = 47;
        a[4] = 89;

        System.out.println("length of array="+a.length);

        for (int i =0 ;i<a.length;i++)
         System.out.println(a[i]);


        int[] b = {34,23,23,12,4,78,32,21};

        System.out.println("length of array(b)="+b.length);

        for (int i =0 ;i<b.length;i++)
            System.out.println(b[i]);


    }

}
