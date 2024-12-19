package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesRadioButtonLabel = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
        boolean isEnabled = yesRadioButtonLabel.isEnabled();

        if(isEnabled){
            yesRadioButtonLabel.click();
            System.out.println("Clicked YesRadioButton");
        }

        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));
        boolean isSelected = yesRadioButton.isSelected();
        if(isSelected){
            WebElement output = driver.findElement(new By.ByCssSelector("span[class='text-success']"));
            System.out.println(output.getText());
        }

        WebElement noDisableRadioButton = driver.findElement(By.id("noRadio"));
        System.out.println(noDisableRadioButton.isEnabled());

    }
}
