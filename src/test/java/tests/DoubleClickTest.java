package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        // Action Class

        //Çift Tıklama
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement doubleClickButtonOutput = driver.findElement(By.id("doubleClickMessage"));
        System.out.println(doubleClickButtonOutput.getText());

        //Sağ Tıklama
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickButton).perform();

        WebElement rightClickButtonOutput = driver.findElement(By.id("rightClickMessage"));
        System.out.println(rightClickButtonOutput.getText());
    }
}
