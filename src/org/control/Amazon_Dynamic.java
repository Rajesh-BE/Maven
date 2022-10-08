package org.control;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Amazon_Dynamic {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in/");
   driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Actions ref = new Actions(driver);
	  WebElement Books = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]//following-sibling::a[text()='Books']"));
	   ref.click(Books).build().perform();
}

}
