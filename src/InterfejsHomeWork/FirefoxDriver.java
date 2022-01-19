package InterfejsHomeWork;

public class FirefoxDriver implements WebDriver{

       @Override
        public void get(String driver) {
            System.out.println("Otwieramy przeglądarkę za pomocą " + driver);
        }

        @Override
        public void findElementBy(String driver) {
            System.out.println("Szukamy elementów za pomocą " + driver);

    }
}
