package org.collection;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(9000);
		JavascriptExecutor js = (JavascriptExecutor)driver;  //narrowCasting
		js.executeScript("window.scroll(0,10000)");       //Scroll Down 
		Thread.sleep(6000);
		//-------------Vertical scrolling--------------//
		driver.navigate().to("https://demo.guru99.com/test/guru99home/scrolling.html");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(500,0)");  //Scroll to right 
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(-500,0)");  //Scroll back to left
		driver.quit();
		//-------------Horizontal Scrolling-----------//
		
		
		

}}
