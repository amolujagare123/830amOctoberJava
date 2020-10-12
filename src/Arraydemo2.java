public class Arraydemo2 {

    public static void main(String[] args) {

        int[] a = {12,32,54,12,5,1,43,6,1,12,67,9,11,2,5,7,3};

        /*
        print only the values which are less than 10*/

        for(int i=0;i<a.length;i++)
        {
           if(a[i]<10)
            System.out.println(a[i]);
        }

    }
}
