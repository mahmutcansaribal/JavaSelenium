package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElemensTest2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);

        //BEKLEME İŞLEMİ

        /*
        WebElement firstButton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();
*/

        // Rengi değişen butonun değiştiğini nasıl anlarız?
//        WebElement colorChangesBtn = driver.findElement(By.id("colorChange"));
//        String className = colorChangesBtn.getAttribute("class");
//        System.out.println("Before Change : "+className);
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.attributeToBe(colorChangesBtn,"class","mt-4 text-danger btn btn-primary"));
//        className = colorChangesBtn.getAttribute("class");
//        System.out.println("After Change : "+className);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();
    }
}
