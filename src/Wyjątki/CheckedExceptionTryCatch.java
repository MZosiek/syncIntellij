package Wyjątki;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionTryCatch {

    public static void main(String[] args){
        try {
            System.out.println("start programu");
            exception("/src/nieistniejącytekst.txt");
        } catch (FileNotFoundException e) {
            System.out.println("wyjątek! :");
            e.getMessage();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing file");
        }
    }



    public static void exception(String path) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);

    }
}
