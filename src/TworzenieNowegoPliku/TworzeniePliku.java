package TworzenieNowegoPliku;

import java.io.File;
import java.io.IOException;

public class TworzeniePliku {

    public static void main(String[] args) throws IOException {


        File file = new File("text.txt");

        if (file.createNewFile()) {
            System.out.println("Nowy plik");
        } else {
            System.out.println("Plik istnieje");
        }
    }
}
