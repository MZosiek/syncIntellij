package NaukaWyjątku;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {
    static Scanner scanner = new Scanner(System.in);



    public static int dayNumber() {

        System.out.println("podaj dzień tygodnia :");

        int day = 0;
        try {
            day = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wyjątek : błędny format danych");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

        return day;

    }

    public static int monthNr()  {

        System.out.println("podaj nazwe miesiąca");


        int month = 0 ;
        month = scanner.nextInt();
        if(month < 12){
            return month;
        }
            try {
               throw new NoValidDataProvided("test");
            } catch (NoValidDataProvided noValidDataProvided) {
                System.out.println("błąd");


            }
        return month;
    }


}
