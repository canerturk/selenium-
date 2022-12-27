package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9_Testim {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();
        driver.findElement(By.name("firstname")).sendKeys("TÜRKER" + Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("GÖKŞİN" + Keys.ENTER);
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.xpath("//input[@id='exp-4']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("24.12.2022"+Keys.ENTER);
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("continents")).sendKeys("Europa" + Keys.ENTER);
        driver.findElement(By.xpath("//")).sendKeys("Europa" + Keys.ENTER);
        driver.findElement(By.id("submit")).click();






    }
}
