package interview;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.KeyEvent;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dice {
     WebDriver driver;
     @Test
	public void money() throws InterruptedException, AWTException {
    	// WebDriverManager.edgedriver().setup();
    	//  driver=new EdgeDriver();
    	  	 WebDriverManager.chromedriver().setup();
     	  driver=new ChromeDriver();
    	 
		
//		System.setProperty("webdriver.edge.driver","src/main/java/msedgedriver.exe");
//	 
//		driver=new EdgeDriver();
		
		  driver.manage().window().maximize();

		  
		  driver.navigate().to("https://www.dice.com/dashboard/login");
		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("chauthai2003@gmail.com");
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Kiwismart1");
		  driver.findElement(By.xpath("//*[@id='loginDataSubmit']/div[3]/div/button")).click();
		  driver.manage().timeouts().implicitlyWait(12000, TimeUnit.SECONDS);
		  //navigate to profile page
		  driver.get("https://www.dice.com/dashboard/profiles");
		
		
		 //this area bypass so you need to click on not now
		    
	
		
		
		
		for(;;) {
		driver.findElement(By.xpath("//*[text()='Upload resume']")).click();
		String parent=driver.getWindowHandle();
		Set<String>set=driver.getWindowHandles();
		for(String child:set) {
			if(!child.equals(child)) {
				driver.switchTo().window(child);
			}
		}
        driver.findElement(By.xpath("//*[@id='dhi-candidates-modal_Zm5kJ7e04G_body']/div/div/seds-button[1]")).click();
		
		
			String file="C:\\Users\\chaut\\OneDrive\\Documents\\PANGIAMMOBILE(NOCITY)Relocated.docx";
			
			Robot robot=new Robot();
			robot.delay(1000);
			StringSelection s=new StringSelection(file);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
			robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyPress(java.awt.event.KeyEvent.VK_V);
			robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
			robot.keyRelease(java.awt.event.KeyEvent.VK_V);
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
			robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			driver.navigate().refresh();
			
			//Thread.sleep(300000);//600000 equals 10 minutes
			driver.findElement(By.cssSelector(".jobs-resume-card__container div:nth-child(2) div button button")).click();
			Thread.sleep(4000);
			driver.findElement(By.cssSelector(".jobs-resume-card__container div:nth-child(2) div div")).click();
			driver.findElement(By.xpath("//*[@id=\"artdeco-toasts\"]/div/div/button")).click();
	
	
		}
			
			
		
		
//		
		//String file="C:\\Users\\chaut\\OneDrive\\Desktop\\toan\\minh.docx";
		//driver.findElement(By.xpath("//*[@id='ember410']/div/div/div[2]/div[2]/div[2]/label")).click();
		//driver.findElement(By.xpath("//*[@id='resume-upload-button']")).sendKeys(file);
		//*[@id="ember439"]/div/div/div[2]/div[2]/div[2]/label
		
		//*[@id="ember410"]/div/div/div[2]/div[2]/div[2]/label//*[@id="ember410"]/div/div/div[2]/div[2]/div[2]/label

		 
	}
		 
		 
		
			  
			 
     {
     }
}
		  
		  


