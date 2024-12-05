package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Test1 {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.Driver","C:\\Users\\mahmu\\IdeaProjects\\JavaSelenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/text-box");

        //Sayfayı Tam Hale Getirme
        driver.manage().window().maximize();
        //Web Elementi Bulma İşlemi ID.
        WebElement userNameElement = driver.findElement(By.id("userName"));
        userNameElement.click();
        userNameElement.sendKeys("Mahmut Can");
        // Web Elementi CSS SELECTOR
        WebElement emailElement = driver.findElement(new By.ByCssSelector("input.mr-sm-2[type='email']"));
        emailElement.click();
        emailElement.sendKeys("mahmutcansaribal@xxxxx.com");

        WebElement currentAdress = driver.findElement(new By.ByCssSelector("textarea.form-control[placeholder='Current Address']"));
        currentAdress.click();
        currentAdress.sendKeys("İstanbul Selenium");

        WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
        permanentAdress.click();
        permanentAdress.sendKeys("İstanbul Java");

        WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();
    }

}
