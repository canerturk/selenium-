package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6_Testim {

    public static void main(String[] args) throws InterruptedException {

        Object drivers;
        System.setProperty("webdriver.chrome.driver",("src/drivers/chromedriver_win32 (2)/chromedriver.exe"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
        Thread.sleep(1000);

        









    }


}
