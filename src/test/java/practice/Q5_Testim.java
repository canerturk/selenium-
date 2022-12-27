package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q5_Testim {
    public static void main(String[] args) throws InterruptedException {

          System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=translate&oq=&aqs=chrome.3.35i39i362l8.98366811j0j15&sourceid=chrome&ie=UTF-8");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000,00));
        //driver.findElement((By.id("tw-source-text-ta"))).click();
        driver.findElement(By.id("tw-source-text-ta")).sendKeys("I want to sleep" + Keys.ENTER );

        driver.findElement(By.xpath("(//span[@lang='tr'])[1]")).getText();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("(//span[@lang='tr'])[1]")).getText());
        driver.close();

        //String title = driver.getWindowHandle();
        //driver.findElement(By.xpath("//div[text()='çeviri'][23]")).click();
        /*String url = driver.getCurrentUrl();

        //  7 - Title ve url'nin "OTTO" kelimesini icerip icermedigini kontrol edelim
        String expData="OTTO";
        if (title.contains(expData))
            System.out.println("Test PASSED");
        else
            System.out.println("OTTO title Test FAILED");
        if (url.contains(expData))
            System.out.println("Test PASSED");
        else
            System.out.println("OTTO url Test FAILED");*/




           /* ...Exercise3...
       go to url : https://www.techlistic.com/p/selenium-practice-form.html
       fill the firstname
       fill the lastname
       check the gender
       check the experience
       fill the date
       choose your profession -> Automation Tester
       choose your tool -> Selenium Webdriver
       choose your continent -> Europa
       choose your command  -> Browser Commands
       click submit button
    */
    /*public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().deleteAllCookies();//Selenium ile tüm domainlerdeki çerezleri silebiliriz. Mevcut etki alanından tüm tanımlama bilgilerini silmek için deleteAllCookies yöntemi kullanılır
        driver.findElement(By.id("ez-accept-all")).click();
        driver.findElement(By.id("cookieChoiceDismiss")).click();
        driver.findElement(By.name("firstname")).sendKeys("Hikmet"+ Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Akyol" + Keys.ENTER);
        WebElement genderRadioButton = driver.findElement(By.id("sex-0"));
        genderRadioButton.click();
        genderRadioButton.sendKeys(Keys.PAGE_DOWN);
        driver.findElement(By.xpath("//input[@id='exp-0']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("24.12.2022"+Keys.ENTER);
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.id("continents")).sendKeys("Europa" + Keys.ENTER);
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        driver.findElement(By.id("submit")).click();*/




    }
}
