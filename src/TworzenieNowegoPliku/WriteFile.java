package TworzenieNowegoPliku;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("test.txt");

        writer.write("Test text in the new file");
        writer.close();
    }
}
