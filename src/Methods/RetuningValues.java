package Methods;

import pack1.Java1;

public class RetuningValues {

    int mymethod(int a)
    {
        return a;
    }


    char mychar()
    {
        char c='g';
        return c;
    }

    boolean getResult()
    {
        boolean result = false;
        return result;
    }

    String getMystring()
    {
        String str ="amol";
        return str;
    }


    int[] getMyarray()
    {
        int[] a ={23,45,12,213,4,1,3,11};
        return  a;
    }

    String[][] getMyStringArray()
    {

        String[][] sArr = {

                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
        };

        return  sArr;

    }

    public Java1 getObject()
    {
        Java1 obj = new Java1();

        obj.a1 =12;
        obj.d1 = 12.4;
        obj.str1 ="amol";
        obj.c1='e';

        return obj;
    }


    void display()
    {

    }

    public static void main(String[] args) {

        RetuningValues ob = new RetuningValues();
        //System.out.println(ob.display()); // not possible
        System.out.println(ob.mymethod(12));
        int a = ob.mymethod(45);
        // int i = 90

        char ch = ob.mychar();
        System.out.println(ch);
        System.out.println(ob.mychar());

        System.out.println(ob.getResult());

        if(ob.getResult())
            System.out.println("Result is true");
        else
            System.out.println("Result is false");


        System.out.println(ob.getMystring());


        // method returning single dimentional array

        int[] arr = ob.getMyarray();

        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");

        // method returning Two dimentional array
        System.out.println();
        String[][] st = ob.getMyStringArray();

        for(int i=0; i<st.length;i++)
        {
           for (int j=0;j<st[0].length;j++)
           {
               System.out.print(st[i][j]+"\t");
           }
            System.out.println();
        }



        // method returning an Object

        Java1 java1 = ob.getObject();
        java1.display1();


    }
}
