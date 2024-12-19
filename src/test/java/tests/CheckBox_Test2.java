package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Test2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
        WebElement sportCheckBoxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
        boolean isEnabled = sportCheckBox.isEnabled();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sportCheckBox);
        System.out.println(isEnabled);

        // Aldığımız hata : Checbox yerine aynı işlevi gören Label'e tıklaması.

        if(isEnabled){
            try{
                System.out.println("Entered try block");
                sportCheckBox.click();
            }catch (ElementClickInterceptedException e) {
                System.out.println("Entered catch block");
                sportCheckBoxLabel.click();
            }
        }
        boolean isSelected = sportCheckBox.isSelected();
        System.out.println(isSelected);

        driver.quit();

    }
}
