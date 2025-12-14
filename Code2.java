package webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // Selenium 4 auto-manages driver

        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);

        WebElement unm = driver.findElement(By.id("email"));
        unm.sendKeys("nprathzzz@gmail.com");
        Thread.sleep(5000);

        WebElement unm2 = driver.findElement(By.name("pass"));
        unm2.sendKeys("123");
        Thread.sleep(5000);

        WebElement button = driver.findElement(By.name("login"));
        button.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
