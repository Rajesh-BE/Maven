package org.collection;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actions2_java {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //implicit Wait
	driver.manage().window().maximize();
	WebElement Mobiles = driver.findElement(By.xpath("/html/body/div/header/div/div[5]/div[2]/div/div/a[3]"));
	Actions act = new Actions(driver);                       //Absolute X-Path
	act.contextClick(Mobiles).build().perform();     //Context Click
    WebDriverWait wait = new  WebDriverWait(driver, 30);
    wait.until(ExpectedConditions.visibilityOf(Mobiles));    //Explicit Wait
	Robot ref = new Robot();
	ref.keyPress(KeyEvent.VK_DOWN);
	ref.keyRelease(KeyEvent.VK_DOWN);
	ref.keyPress(KeyEvent.VK_ENTER);
	ref.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);                                         //Absolute X-Path
	WebElement Electronics = driver.findElement(By.xpath("/html/body/div/header/div/div[5]/div[2]/div/div/a[5]"));
	act.contextClick(Electronics).build().perform();  //Context Click
	ref.keyPress(KeyEvent.VK_DOWN);
	ref.keyRelease(KeyEvent.VK_DOWN);
	ref.keyPress(KeyEvent.VK_ENTER);
	ref.keyRelease(KeyEvent.VK_ENTER);
	Set<String> Handles = driver.getWindowHandles();  //Handling multiple windows
	for (String rajesh : Handles) {
		System.out.println(driver.switchTo().window(rajesh).getTitle());   //GetText for all the windows
}
}
}
