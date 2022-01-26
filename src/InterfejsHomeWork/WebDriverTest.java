package InterfejsHomeWork;

public class WebDriverTest {
    public static void main(String[] args) {

    /*    ChromeDriver chrome = new ChromeDriver();
        chrome.get("Chrome");
        chrome.findElementBy("Chrome");


        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get("Firefox");
        firefox.findElementBy("firefox");

     */


     //   WebDriver driver = new ChromeDriver();


        WebDriver driver1 = getDriver("chrome");
        driver1.get("chrome");

        WebDriver driver2 = getDriver("firefox");
        driver2.get("firefox");
    }

    private static WebDriver getDriver(String driverName) {

        if(driverName.equals("chrome")){
            return new ChromeDriver();
        } else if (driverName.equals("firefox")){
            return  new FirefoxDriver();
        }
        return null;

    }
}
