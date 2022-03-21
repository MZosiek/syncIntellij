package Wyjątki;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public static void main(String[] args) throws FileNotFoundException {
        exception("/src/nieistniejącytekst.txt");
    }



    public static void exception(String path) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);

    }
}
