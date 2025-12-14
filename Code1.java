package webdrivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Demo1 {
	public static void main (String[] args) {
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://www.google.com");
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        driver.manage().window().maximize();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        System.out.println(driver.getTitle());
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        driver.quit();
	}
	

}
