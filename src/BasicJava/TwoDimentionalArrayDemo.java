package BasicJava;

public class TwoDimentionalArrayDemo {

    public static void main(String[] args) {


        int[][] a = new int[4][3];

        a[0][0] = 21;
        a[0][1] = 23;
        a[0][2] = 33;

        a[1][0] = 21;
        a[1][1] = 23;
        a[1][2] = 33;

        a[2][0] = 21;
        a[2][1] = 23;
        a[2][2] = 33;

        a[3][0] = 21;
        a[3][1] = 23;
        a[3][2] = 33;

        int row = a.length;
        int col = a[0].length;


        for(int i =0; i<row ;i++ )
        {
            for (int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
