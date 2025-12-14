package webdrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
@SuppressWarnings("unused")
public class Demo4 {
	public static void main(String[] args) {
		// Optional: ChromeOptionsfor custom configurations
		ChromeOptions options = new ChromeOptions();
		// Uncomment if needed
		WebDriver driver = new ChromeDriver(options);
		try {
		// Open the specified URL
		driver.get("http://demo.guru99.com/test/guru99home/");
		System.out.println("Opened target URL");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Waitfor 2 seconds
		Thread.sleep(2000);
		driver.switchTo().frame("a077aa5e");
		System.out.println("Switched to the iframe with ID 'a077aa5e'");
		Thread.sleep(2000);// Wait before interacting with element
		WebElement iframeElement =
		driver.findElement(By.xpath("/html/body/a/img"));
		iframeElement.click();// Performthe click action
		System.out.println("*We are done*");
		Thread.sleep(2000);// Wait to observe post-click action
		// Optionally,switch back to the main page
		driver.switchTo().defaultContent();
		} catch (Exception e) {
		e.printStackTrace();
		} finally {
		// Close the browse
			driver.quit();
		}
	}

}
