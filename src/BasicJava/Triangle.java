package BasicJava;

public class Triangle {
    public static void main(String[] args) {
        int a = 90;
        int b = 90;
        int c = 0;

        if(a+b+c==180 && a>0 && b>0 && c>0) {

            if (a == b && b == c) //------> equilateral triangle
                System.out.println("equilateral triangle");

            if (a != b && b != c) //--->  sclalene   triangle
                System.out.println("sclalene  triangle");

            if (a == 90 || b == 90 || c == 90)// ---> right angled trigle
                System.out.println("right angled trigle");

            if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b)) //isoselence triangle
                System.out.println("isoselence triangle");

        }
        else
            System.out.println("not a triangle");
    }

}
