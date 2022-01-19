package InterfejsHomeWork;

public class WebDriverTest {
    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        chrome.get("Chrome");
        chrome.findElementBy("Chrome");


        FirefoxDriver firefox = new FirefoxDriver();
        firefox.get("Firefox");
        firefox.findElementBy("firefox");
    }
}
