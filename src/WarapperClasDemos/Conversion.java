package WarapperClasDemos;

public class Conversion {

    public static void main(String[] args) {

        String s1 = "12";
        String s2 = "12";

        System.out.println(s1+s2);

        int s11= Integer.parseInt(s1);
        int s22= Integer.parseInt(s2);

        System.out.println(s11+s22);

        String d1 = "23.5";
        String d2 = "12.4";

        System.out.println(d1+d2);

        double d11 = Double.parseDouble(d1);
        double d22 = Double.parseDouble(d2);

        System.out.println(d11+d22);


        String str = "s";

   // how will you convert a single character string into a character

        char c = str.charAt(0);


    }

}
