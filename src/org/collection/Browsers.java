package org.collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browsers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rajesh\\\\eclipse-workspace\\\\project12\\\\driver\\\\chromedriver.exe");
	    WebDriver ref = new ChromeDriver();
	    ref.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
	    ref.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    List<WebElement> Table = ref.findElements(By.xpath("/html/body/div/div[2]/div[4]/div/table"));
	    for (WebElement webElement : Table) {              //Absolute X-path 
	    	System.out.println(webElement.getText());}
	   
	   
	
	
	
	
	
	
	
	} }
