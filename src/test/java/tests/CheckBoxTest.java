package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";

        WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        //homeCheckBox.click();



        homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");

        if(homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
            System.out.println( "Checkbox is checked!" );
        }else{
            System.out.println( "Checkbox is unchecked!" );
        }

    }
}
