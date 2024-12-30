package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
        //div/button[starts-with(text(),'Click Me')]

        // Son butonu elde etme
        // //div[last()]/button

        WebElement dynamicClickBtn = driver.findElement(By.xpath("//div[last()]/button"));
        dynamicClickBtn.click();
    }
}
