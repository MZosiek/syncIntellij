package TworzenieNowegoPliku;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
         File file = new File("text.txt");

         if(file.delete()){
             System.out.println("Plik usunięty");
         } else {
             System.out.println("Nie udalo się usunąć");
         }
    }
}
