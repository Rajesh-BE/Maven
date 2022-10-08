package org.control;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon2_Dynamic {
public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.amazon.in/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 List<WebElement> Full_Row = driver.findElements(By.xpath("(//div[@id='desktop-btf-grid-8']//following-sibling::div[@id='desktop-6']//preceding-sibling::hr[@data-display-at='smws'])[4]//preceding-sibling::div[@id='desktop-4']"));
 Thread.sleep(5000);
 for (WebElement Row : Full_Row) {
	 String text = Row.getText();
	 System.out.println(text);
	
}
 
 

}
 
	
}


