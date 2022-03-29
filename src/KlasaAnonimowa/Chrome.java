package KlasaAnonimowa;

public class Chrome implements WebDrivers{
    @Override
    public void getDriver() {
        System.out.println("Wybierz Chrome'a");
    }

    @Override
    public void searchByDriver() {
        System.out.println("Szukaj za pomocą Chrome'a");

    }
}
