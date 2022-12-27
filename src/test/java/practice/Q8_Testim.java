package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q8_Testim {
    public static void main(String[] args) {



        System.setProperty("web-driver.chrome.driver","src/drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10,00));

        driver.get("https://www.otto.com.de");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        String expData = "otto";

        if  (title.contains(expData))
            System.out.println("test PASSED");
        else
            System.out.println("test failed");
        driver.navigate().to("https://www.wisequarter.com");
        String expQuarter = "Quarter";
        String titleQuarter = driver.getTitle();
        String urlQuarter = driver.getCurrentUrl();
        if (titleQuarter.contains(expQuarter))
        System.out.println("test passed");
        else
            System.out.println("test failed");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();

















    }

}
