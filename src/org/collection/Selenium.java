package org.collection;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Selenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("http://leafground.com/pages/Dropdown.html");
		ref.manage().window().maximize();
		WebElement All = ref.findElement(By.xpath("(//div[@class='example']//select)[6]"));
		Select Dd = new Select(All);
		boolean multiple = Dd.isMultiple();  //IsMultiple
		System.out.println(multiple);
		List<WebElement> AB = Dd.getOptions();  //getOptions
		for (int i = 0; i < AB.size(); i++) {
			System.out.println(AB.get(i).getText()); }
		Dd.selectByVisibleText("Selenium");          //SelectByVisibleText
		Dd.selectByVisibleText("Appium");
		Thread.sleep(6000);
		WebElement BC = Dd.getFirstSelectedOption();  //getFirstSelectedOptions
		System.out.println(BC.getText());
		List<WebElement> BD = Dd.getAllSelectedOptions();  //getAllSelectedOptions
		for (WebElement webElement : BD) {
			System.out.println(webElement.getText());}
		Dd.deselectAll();                 //deSelectAll
		
	    
			
		
		
		
		
	}}
	
	
	
	
	
	
	
	
	
	
	
	
