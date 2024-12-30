package tests;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class BrokenLinkTest {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/broken");

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://the-internet.herokuapp.com/status_codes/500");
        HttpResponse response = client.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("Status Code : "+statusCode);



//        WebElement brokenElement = driver.findElement()


    }
}
