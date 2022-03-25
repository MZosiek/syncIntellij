package NaukaEnum;

public class FirefoxWebDriver implements WebDrivers{

   @Override
    public void getDriver(String driver) {
       System.out.println("wybieram przeglądarkę " + driver);

    }

    @Override
    public void findBy(String driver) {
        System.out.println("szukam za pomocą " + driver);

    }
}
