public class FibonancciDemo {

    public static void main(String[] args) {

        int a =0 ;
        int b =1;
        int sum =0;

        int n = 8; // number of terms

        System.out.print(a+" "+b);
        for(int i =2 ; i<n;i++)
        {
            sum = a+b;
            System.out.print(" "+sum);

            a =b;
            b =sum;
        }


    }
}
