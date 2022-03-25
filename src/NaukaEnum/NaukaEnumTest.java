package NaukaEnum;

import InterfejsHomeWork.ChromeDriver;
import InterfejsHomeWork.FirefoxDriver;
import InterfejsHomeWork.WebDriver;

public class NaukaEnumTest {


    public static void main(String[] args) throws WrongDriverProvided {


        WebDrivers driver1 = GetDriver2( AvailableDrivers.FIREFOX);
        driver1.getDriver("firefox");
        driver1.findBy("chrome");



    }




        private static WebDrivers GetDriver2(AvailableDrivers driverNames) throws WrongDriverProvided {
            if (driverNames==AvailableDrivers.FIREFOX) {
                return new FirefoxWebDriver();
            } else if (driverNames== AvailableDrivers.CHROME) {
                return new ChromeWebDriver();
            }
            throw new WrongDriverProvided("Zła przeglądarka");
        }


    }
