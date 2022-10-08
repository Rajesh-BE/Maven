package org.control;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Normal_Class {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mobile-apps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  //Implicit wait
		Actions ref = new Actions(driver);                           //Actions Class
		WebElement Men = driver.findElement(By.xpath("(//span[@class=\"_2I9KP_\"])[1]//following::span[text()='Men']"));
		ref.click(Men).build().perform();                                                       //Dynamic x-Path
		
	}
	
	
	

}
