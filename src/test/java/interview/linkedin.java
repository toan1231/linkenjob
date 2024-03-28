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

public class linkedin {
     WebDriver driver;
     @Test
	public void money() throws InterruptedException, AWTException {
    	 WebDriverManager.edgedriver().setup();
    	  driver=new EdgeDriver();
//    	  	 WebDriverManager.chromedriver().setup();
//     	  driver=new ChromeDriver();
    	 
		
//		System.setProperty("webdriver.edge.driver","src/main/java/msedgedriver.exe");
//	 
//		driver=new EdgeDriver();
		
		  driver.manage().window().maximize();

		  driver.navigate().to("https://www.linkedin.com");
		 // driver.navigate().to("https://www.dice.com/");
		  
		  
	
		driver.findElement(By.xpath("//*[@id='session_key']")).sendKeys("chauthai2003@gmail.com");
		driver.findElement(By.xpath("//*[@id='session_password']")).sendKeys("Kiwismart1");
		driver.findElement(By.xpath("//*[@id='main-content']/section[1]/div/div/form/div[2]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(12000, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//*[@id='global-nav']/div/nav/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@href='https://www.linkedin.com/jobs/application-settings']")).click();
		
		
		for(;;) {
		driver.findElement(By.xpath("//*[text()='Upload resume']")).click();

		//C:\\Users\\chaut\\OneDrive\\Documents\\PANGIAMMOBILE(JAVASCRIPT)CAN_RELOCATED.docx
		
			String file="C:\\Users\\chaut\\OneDrive\\Documents\\PANGIAMMOBILE(JAVASCRIPT)CAN_RELOCATED.docx";
			//PANGIAMMOBILE(JAVASCRIPT)CAN_RELOCATED.docx
			
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
			
			//Chau thai you can stop here for any Abstraction
			Thread.sleep(500000);
			driver.navigate().refresh();
			

			
			Thread.sleep(6000);//600000 equals 10 minutes
			driver.findElement(By.cssSelector(".jobs-resume-card__container div:nth-child(2) div button button")).click();
			Thread.sleep(4000);
			driver.findElement(By.cssSelector(".jobs-resume-card__container div:nth-child(2) div div")).click();
			driver.findElement(By.xpath("//*[@id=\"artdeco-toasts\"]/div/div/button")).click();
			
			
			
	
			
	
	
	
		}
			
			
		
		


		 
	}
		 
		 
		
			  
			 
     {
     }
}
		  
		  


