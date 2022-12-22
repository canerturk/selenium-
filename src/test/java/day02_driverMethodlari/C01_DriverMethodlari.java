package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public C01_DriverMethodlari() {
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String expectedKelime = "amazon";
        String actualResult = driver.getTitle();
        if (actualResult.contains(expectedKelime)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title amazon icermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }

        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url istediginiz degerde degil");
            System.out.println(driver.getCurrentUrl());
        }

        Thread.sleep(5000L);
        driver.close();
    }
}
