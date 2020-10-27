package ExceptionDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadOperation {

    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fp = new FileInputStream("D:\\jit1\\myImage.png");

        System.out.println("File read");

        System.out.println("End of the program");

    }
}
