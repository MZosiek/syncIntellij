package KlasaAnonimowa;

public class WebDriverTest {
    public static void main(String[] args) {

        WebDrivers chrome = new Chrome();
        WebDrivers firefox = new Firefox();

        chrome.getDriver();
        chrome.searchByDriver();
        System.out.println("/n");
        firefox.getDriver();
        firefox.searchByDriver();
        System.out.println("/n");

        // Klasa anonimowa jest robiona tylko dla 1 obiektu.
        // mogę stworzyć klasę dla 1 obiektu która będize miała inne metody niż te ustalone w konstruktorach.
        // muszę wtedy odwołać się do interfejsu - będę wtedy musiał utworzyć body metody

        WebDrivers safari = new WebDrivers() {
            @Override
            public void getDriver() {
                System.out.println("Wybieram  safari");
            }

            @Override
            public void searchByDriver() {
                System.out.println("Szukam za pomocą safari");

            }
        };
        safari.getDriver();
        safari.searchByDriver();

    }
}
