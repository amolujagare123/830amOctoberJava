package BasicJava;

public class TwodimentionalArray2 {

    public static void main(String[] args) {


        int[][] a = {
                {12,23,45,67},
                {20,12,14,17},
                {21,25,15,66},
        };

        // row = 3 , col = 4

        System.out.println("row="+a.length);
        System.out.println("col="+a[0].length);

        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
