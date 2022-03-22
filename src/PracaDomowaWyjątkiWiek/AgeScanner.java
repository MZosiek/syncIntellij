package PracaDomowaWyjątkiWiek;

import java.util.Scanner;

public class AgeScanner {

    public static Scanner scanner = new Scanner(System.in);


    public static String wiek() throws InvalidAgeException {
        String text="";

        System.out.println("podaj swój wiek");

        int age = scanner.nextInt();

        if (age > 0 && age <=18){
            text = "jesteś niepełnoletni";
            return text;
        } else if ( age >18 ){
            text = "jesteś pełnoletni";
            return text;
        }

        throw new InvalidAgeException("Niepoprawny wiek");


    }
}
