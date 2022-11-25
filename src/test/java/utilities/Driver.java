package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    public Driver() {
    }

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
              case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;


                    /*
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class);
                    driver = new SafariDriver();
                    break;

                     */
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            /*
            Testlerimizi calistirdigimizda her seferinde yeni driver olusturdigi icin her test methodu
            icin yeni bir pencere(driver) aciyor. Eger druber'a bir deger atanmissa yani driver==null
            ise bir kere driver'i calistir diyerek bir kere if icini calistiracak. Ve driver artik bir kire calistigi
            icin ve deger atandigi icin null olmayacak ve direk return edecek ve diger teslerimizi
            ayni pencere(driver) uzerinde calistiracak
            */
        }


        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver = null;//Kapandiktan sonraki acmalari garanti altina almak icin driver i tekrar null yaptik
        }
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;//Kapandiktan sonraki acmalari garanti altina almak icin driver i tekrar null yaptik
        }
    }
}
