package org.collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dynamic_Xpath {
	public static void main(String[] args) {
		//Scanner ref = new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		for (WebElement Web : Links) {
			System.out.println(Web.getAttribute("href"));
		}
		WebElement india = driver.findElement(By.xpath("//div[text()='India']"));
		String text = india.getText();
		System.out.println(text);
	}

}
