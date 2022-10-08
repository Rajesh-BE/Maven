package org.collection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions_Java {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://demoqa.com/");
		ref.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)ref;
		WebElement Element1 = ref.findElement(By.className("card-body"));
		js.executeScript("arguments[0].click();", Element1);  //Clicked using JavaScriptExecuter 
		WebElement Element2 = ref.findElement(By.xpath("//span[text()='Buttons']"));
	    js.executeScript("arguments[0].click()", Element2);    //Clicked using JavaScriptExecuter 
	    Thread.sleep(5000);
		WebElement Double = ref.findElement(By.xpath("(//button[@type='button'])[2]"));
		Actions act = new Actions(ref);
		act.doubleClick(Double).build().perform();  //DoubleClick
		Thread.sleep(3000);
		WebElement Right = ref.findElement(By.id("rightClickBtn"));
		act.contextClick(Right).build().perform();  //ContextClick 
		Thread.sleep(3000);
        WebElement Dynamic= ref.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(Dynamic).build().perform();      //DynamicClick
		Thread.sleep(3000);
		ref.navigate().to("https://demoqa.com/tabs");
		WebElement MoveElement = ref.findElement(By.id("demo-tab-origin"));
		act.moveToElement(MoveElement, 1, 2);
		
	    
		
	}

}
