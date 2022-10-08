package org.collection;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CSS_Selector {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//----------------Next Line------------------------------------//
		Actions ref = new Actions(driver);                 //Actions Class    
		JavascriptExecutor js = (JavascriptExecutor)driver;  //JavaScriptExecuter
		Robot ref1 = new Robot();                     //Robot Class
		//----------------Next Line------------------------------------//
		driver.switchTo().frame("callout");          //Switched from main page to Frame 
		WebElement PopUp = driver.findElement(By.cssSelector("[jsname*='ZUkOIc']"));
		ref.click(PopUp).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 15);      //Explicit Wait
		wait.until(ExpectedConditions.visibilityOf(PopUp));
		driver.switchTo().defaultContent();                    //Switched from frame to main Web page
		//----------------Next Line------------------------------------//
		WebElement Search = driver.findElement(By.cssSelector("[type$='xt']"));
		js.executeScript("arguments[0].click()", Search);       //Clicked Using JavaScriptExecuter
		Search.sendKeys("https://www.instagram.com/");
		ref1.keyPress(KeyEvent.VK_ENTER);                      //Entered Using keyboard methods
		ref1.keyRelease(KeyEvent.VK_ENTER);
		//----------------Next Line------------------------------------//
		WebElement Instagram = driver.findElement(By.cssSelector("[class^='LC20lb']"));  //CSS selector
		js.executeScript("arguments[0].click()", Instagram);
		//----------------Next Line------------------------------------//
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement Email = driver.findElement(By.cssSelector("input[name='username']"));  //CSS Selector
		Email.click();
		Email.sendKeys("RajeshKumar@gmail.com");
		//----------------Next Line------------------------------------//
		WebElement Password = driver.findElement(By.cssSelector("input[class='_2hvTZ pexuQ zyHYP']"));
		ref.click(Password).build().perform();
		Password.sendKeys("1234@abcd");
		//----------------Next Line------------------------------------//
		WebElement LoginIn = driver.findElement(By.cssSelector("button[type='submit']"));
		js.executeScript("arguments[0].click()", LoginIn);
		//----------------Next Line------------------------------------//
		WebElement Using_FB = driver.findElement(By.cssSelector("span.KPnG0"));
		ref.click(Using_FB).build().perform();
		//----------------Next Line------------------------------------//
		WebElement Email_1 = driver.findElement(By.cssSelector("input#email"));
	    Email_1.click();
	    Email_1.sendKeys("google1234@gmail.com");
	    //----------------Next Line------------------------------------//
	    WebElement Password_1 = driver.findElement(By.cssSelector("[type='password']"));
	    Password_1.click();
	    Password_1.sendKeys("qwerty1234");
	    //----------------Next Line------------------------------------//
	    WebElement LoginIn_1 = driver.findElement(By.cssSelector("[name='login']"));
	    js.executeScript("arguments[0].click()", LoginIn_1);
	    //----------------Next Line------------------------------------//
	    Thread.sleep(12000);
	    TakesScreenshot WebPage = (TakesScreenshot)driver;
	    File source = WebPage.getScreenshotAs(OutputType.FILE);         //TakeScreenShot Method
	    File destination = new File("C:\\Users\\rajesh\\eclipse-workspace\\project12\\SavedScreenshots.page.png");
	    FileUtils.copyFile(source, destination);
	    
	
	
	
	
	
	
	}

}
