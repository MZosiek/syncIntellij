package KlasaAnonimowa;

public class Firefox implements WebDrivers{

    @Override
    public void getDriver() {
        System.out.println("Wybierz Firefox");
    }

    @Override
    public void searchByDriver() {
        System.out.println("Szukaj za pomocą Firefox");

    }
}
