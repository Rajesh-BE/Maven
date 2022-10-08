package org.collection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://demoqa.com/nestedframes");
	    ref.manage().window().maximize();
		Thread.sleep(5000);
		ref.switchTo().frame("frame1");  //switching to Frame1 using (Id) from main web page
		WebElement Element1 = ref.findElement(By.xpath("//body[text()='Parent frame']"));
		String text = Element1.getText();   //getting the text from Frame1
		System.out.println("Frame 1 is :" + text );
		ref.switchTo().frame(0);       //switching to Frame0 using (index) from Frame1
		WebElement Element2 = ref.findElement(By.xpath("//p[text()='Child Iframe']"));
		String text2 = Element2.getText();   //getting the text from Frame0
		System.out.println("Frame 0 is :" + text2);
		ref.switchTo().defaultContent();    //returning back from Frame to main web page
		
	//----------------------------------------------------------------//////Multiple Frame
		
		
	 
	
	
	
	
	
	
	}}
