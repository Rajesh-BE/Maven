package org.collection;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Amazon {
public static void main(String[] args) throws InterruptedException, IOException, AWTException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rajesh\\eclipse-workspace\\project12\\driver\\chromedriver.exe");
	WebDriver ref = new ChromeDriver();  
	ref.get("https://en-gb.facebook.com/login.php");
	ref.manage().window().maximize();
	ref.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //Implicit Wait
	JavascriptExecutor java = (JavascriptExecutor)ref;          //JavaScriptExecuter
	Actions act = new Actions(ref);                     //Actions class
	//-----------------------------------------------------------------------------------------------------------
	WebElement SignIN = ref.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div[2]/form/div/div[4]/a[2]"));
	act.click(SignIN).build().perform();
	Thread.sleep(3000);
	//-------------------------------------------------------------------------------------------------------------
	WebElement FirstName= ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/div/input"));
	act.click(FirstName).build().perform();                             //Dynamic Click
	FirstName.sendKeys("Raju");                            //SendKeys
	//-----------------------------------------------------------------------------------------------------------------
	WebDriverWait wait = new WebDriverWait(ref, 20);                //Explicit Wait
	wait.until(ExpectedConditions.visibilityOf(FirstName));
	//-------------------------------------------------------------------------------------------------------------
    WebElement Surname= ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div/div/div[2]/div/div/input"));
	act.click(Surname).build().perform();
	Surname.sendKeys("Bhai");
	//-------------------------------------------------------------------------------------------------------------
	WebElement PhNumber = ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[2]/div/div/input"));
	act.click(PhNumber).build().perform();
	PhNumber.sendKeys("73973995");
	//-------------------------------------------------------------------------------------------------------------------
	WebElement Psswd = ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/div/div/input"));
	act.click(Psswd).build().perform();
	Psswd.sendKeys("abcd@1234");
	//------------------------------------------------------------------------------------------------------------------------
	WebElement Day= ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[5]/div[2]/span/span/select"));
	Select SS = new Select(Day);                         //Select Class
	SS.selectByValue("1");                               //SelectByValue
	//-----------------------------------------------------------------------------------------------------------------------------
	WebElement Month = ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[5]/div[2]/span/span/select[2]"));
	Select SS1 = new Select(Month);
	SS1.selectByVisibleText("Jan");                        //SelectByVisibleText
	//-----------------------------------------------------------------------------------------------------------------------
	WebElement Year = ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[5]/div[2]/span/span/select[3]"));
	Select SS2 = new Select(Year);
	SS2.selectByVisibleText("1999");
	//-----------------------------------------------------------------------------------------------------------------------------
	WebElement Gender= ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[7]/span/span[2]/input"));
	Gender.click();
	//---------------------------------------------------------------------------------------------------------------------------------------
	WebElement SignUp= ref.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[11]/button"));
	java.executeScript("arguments[0].click();",SignUp );   //Clicked using JavaScriptExecuter
	Thread.sleep(11000);
	//-----------------------------------------------------------------------------------------------------------------------------------
	TakesScreenshot FB_Login = (TakesScreenshot) ref;      //TakeScreenShot Methods
	File A = FB_Login.getScreenshotAs(OutputType.FILE);
	File B = new File("C:\\Users\\rajesh\\eclipse-workspace\\project12\\SavedScreenshots.Project.png");
	FileUtils.copyFile(A, B);
	//------------------------------------*---------------------------*-------------------------------------------------------------------
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//WebElement SearchBox = ref.findElement(By.xpath("//input[@type='text']"));
	//SearchBox.click();
	//Thread.sleep(5000);
	//SearchBox.sendKeys("iphone 13pro max");
	//Thread.sleep(4000);
	//WebElement Phone = ref.findElement(By.xpath("//div[@role='button'][1]"));
	//Phone.click();
	//Thread.sleep(5000);
	
		//TakesScreenshot phone = (TakesScreenshot) ref;  
		//File A = phone.getScreenshotAs(OutputType.FILE);
		//File B = new File("C:\\Users\\rajesh\\eclipse-workspace\\project12\\SavedScreenshots.phone.png");
	    //FileUtils.copyFile(A, B);
	//WebElement Alert1= ref.findElement(By.xpath("//img[@alt='Alert']"));
	//Alert1.click();
	//WebElement AlertBox = ref.findElement(By.xpath("//button[text()='Alert Box']"));
	//AlertBox.click();
	//Thread.sleep(5000);
	//ref.switchTo().alert().accept();
	//WebElement ConfirmBox = ref.findElement(By.xpath("//button[contains(text(),'Confirm')]"));
	//ConfirmBox.click();
	//Thread.sleep(5000);
	//ref.switchTo().alert().dismiss();
	//WebElement PromptBox = ref.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	//PromptBox.click();
	//Thread.sleep(6000);
	//ref.switchTo().alert().sendKeys("Greens Technology");  //sendKeys
	//String text = ref.switchTo().alert().getText();
	//System.out.println(text);
	//Thread.sleep(5000);
	//ref.switchTo().alert().accept();
	//WebElement Option = ref.findElement(By.xpath("//yt-icon[@id='guide-icon'][1]"));  
	//Option.click();                                                      //[index]
	//Thread.sleep(4000);
	//WebElement Shorts= ref.findElement(By.xpath("//yt-formatted-string[text()='Shorts']"));
	//Shorts.click();                                                       //fullText
	//Thread.sleep(3000);
	//WebElement Signin= ref.findElement(By.xpath("//yt-formatted-string[contains(text(),'in')][1]"));
	//Signin.click();                                                     //halfText & index
	//WebElement BestSells = ref.findElement(By.xpath(("//a[@class=\"nav-a  \"][1]")));  //[index]
	//BestSells.click();
	//WebElement Service= ref.findElement(By.xpath("//a[text()='Customer Service']"));  //fullText
	//Service.click();
	//WebElement Service2 = ref.findElement(By.xpath("//a[contains(text(),'Customer')][1]"));
	//Service2.click();                                                           //halfText & Index
	//ref.get("https://www.instagram.com/");
	//ref.manage().window().maximize();
	//Thread.sleep(6000);
	//WebElement findElement = ref.findElement(By.xpath("//input[@type='text']"));
	//findElement.click();
	//findElement.sendKeys("rajesh123@gmail.com");
	//String text = findElement.getText();  //getText
	//System.out.println("Nil"+text);
	//String attribute = findElement.getAttribute("text");  //getAttribute 
	//System.out.println(attribute);
	//String attribute2 = findElement.getAttribute("type");  //getAttribute
    //System.out.println(attribute2);
    //boolean displayed = findElement.isDisplayed();  //isDispplayed
    //System.out.println(displayed);
    //boolean enabled = findElement.isEnabled();  //isEnabled
    //System.out.println(enabled);
    //boolean selected = findElement.isSelected();  //isSelected
    //System.out.println(selected);
	//WebElement findElement2 = ref.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']"));
	//findElement2.click();
	//findElement2.sendKeys("1234abcd");
    //WebElement findElement3 = ref.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ']"));
    //findElement3.click();
    //WebElement findElement4 = ref.findElement(By.xpath("//a[@class='_2Lks6']"));  //forgot password
    //findElement4.click();
    //String title = ref.getTitle();  //getTtitle
	//System.out.println(title);
	//String currentUrl = ref.getCurrentUrl();  //getCurrentUrl
	//System.out.println(currentUrl);
	//ref.getPageSource();
	//String windowHandle = ref.getWindowHandle();  //getWindowHandle
	//System.out.println(windowHandle);
	//Set<String> windowHandles = ref.getWindowHandles();  //getWindowHandles
	//System.out.println(windowHandles);
	//ref.manage().window().maximize();
	//ref.navigate().to("https://www.facebook.com/");
	//ref.navigate().back();
	//ref.navigate().refresh();
	//ref.navigate().forward();
	//ref.manage().window().fullscreen();
	//ref.switchTo();
	//ref.quit();
	
}
}
