package NaukaEnum;

public class ChromeWebDriver implements WebDrivers{
    @Override
    public void getDriver(String driver) {
        System.out.println("wybieram przeglądarkę chrome");
    }

    @Override
    public void findBy(String driver) {
        System.out.println("szukam za pomocą chrome");

    }
}
