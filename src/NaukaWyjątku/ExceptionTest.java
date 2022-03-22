package NaukaWyjątku;

public class ExceptionTest {
    public static void main(String[] args) throws NoValidDataProvided {

        dateKonstruktor date = new dateKonstruktor();

        date.dayOfWeek = ScannerClass.dayNumber();
        date.monthNumbero = ScannerClass.monthNr();

        System.out.println(" dzień : " + date.dayOfWeek + " , miesiąc : " + date.monthNumbero);




    }
}
