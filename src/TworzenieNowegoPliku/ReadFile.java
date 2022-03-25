package TworzenieNowegoPliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        File reader = new File("test.txt");

        Scanner scanner = new Scanner((reader));

        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
