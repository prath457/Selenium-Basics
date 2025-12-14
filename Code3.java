package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3 {

    public static void main(String[] args) {

        WebDriver driver = null;

        try {
            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver(options);

            driver.manage().window().maximize();
            Thread.sleep(3000);

            driver.get("https://www.google.com");
            System.out.println("Opened Google homepage");
            Thread.sleep(3000);

            driver.navigate().to("https://www.openai.com");
            System.out.println("Navigated to OpenAI");
            Thread.sleep(3000);

            driver.navigate().back();
            System.out.println("Navigated back to Google");
            Thread.sleep(3000);

            driver.navigate().forward();
            System.out.println("Navigated forward to OpenAI");
            Thread.sleep(3000);

            driver.navigate().refresh();
            System.out.println("Page refreshed");
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
