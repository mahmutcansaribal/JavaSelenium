package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;


public class Test1 {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.Driver","C:\\Users\\mahmu\\IdeaProjects\\JavaSelenium\\drivers\\chromedriver.exe");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-ads");
        WebDriver driver = new ChromeDriver();

        ArrayList<String> getDatas = new ArrayList<>();

        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            driver.get("https://demoqa.com/text-box");
            //Sayfayı Tam Hale Getirme
            driver.manage().window().maximize();

            //Web Elementi Bulma İşlemi ID.
            WebElement userNameElement = driver.findElement(By.id("userName"));
            WebElement emailElement = driver.findElement(new By.ByCssSelector("input.mr-sm-2[type='email']"));
            WebElement currentAdress = driver.findElement(new By.ByCssSelector("textarea.form-control[placeholder='Current Address']"));
            WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
            WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
            // Sayfayı Scroll etmemize yarayan JavaScript Kodudur.
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", permanentAdress);


            userNameElement.click();
            userNameElement.sendKeys("Mahmut Can");

            emailElement.click();
            emailElement.sendKeys("mahmutcansaribal@xxxxx.com");

            currentAdress.click();
            currentAdress.sendKeys("İstanbul Selenium");

            permanentAdress.click();
            permanentAdress.sendKeys("İstanbul Java");

            submitButton.click();

            WebElement nameElement = driver.findElement(By.xpath("//*[@id='name']"));
            String userNameText = nameElement.getText().substring(5);


            WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
            String emailText = email.getText().substring(6);

            getDatas.add(userNameText);
            getDatas.add(emailText);

            for(String x : getDatas){
                System.out.println("Veriler : "+x);
            }
            System.out.println("------");
            for(int i = 0; i<getDatas.size();i++){
                System.out.println(getDatas.get(i));
            }

        }catch (Exception e){
            System.out.println("Hata :"+e);
        }


    }

}
