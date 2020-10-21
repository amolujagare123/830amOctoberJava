package InheritancePolymorphism;

import java.util.Date;

public class MethodArguments {


    void printCharacter(char c)
    {
        System.out.println("The caracter passed here is :"+c);
    }

    void myResult(boolean result)
    {
        System.out.println("Result:"+result);
    }

    void  pritDate(Date date)
    {
        System.out.println(date);
    }

    void printAminalMethod(Animal obj)
    {
        obj.eat();
    }


    void printsingleDiArray(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");

    }

    void  printTwoDiArray(int[][] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {


        MethodArguments ob = new MethodArguments();

        ob.printCharacter('h');

        ob.myResult(true);

        Date date = new Date();
        ob.pritDate(date);

        ob.pritDate(new Date());

        Animal animal = new Animal();

        ob.printAminalMethod(animal);


        int[] a = {32,12,5,1,54,2,1};

        ob.printsingleDiArray(a);

        int[][] b = {
                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3}
        };
        System.out.println();
              ob.printTwoDiArray(b);
    }
}
