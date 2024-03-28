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

public class Indeed {
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

		  driver.navigate().to("https://www.indeed.com/?from=gnav-util-homepage");
		driver.findElement(By.xpath("(//*[text()='Sign in'])[1]")).click();
		 By by1= By.xpath("//*[@id='ifl-InputFormField-ihl-useId-passport-webapp-1']");
		  driver.findElement(by1).sendKeys("chauthai2003@gmail.com");
		  driver.findElement(By.xpath("//*[@id='emailform']/button")).click();
		//*[@id='emailform']/button
		  
//		  Thread.sleep(200000);
		  
		 driver.manage().timeouts().implicitlyWait(1200000, TimeUnit.SECONDS);
		 
	
		
		
//		WebElement ele= driver.findElement(By.xpath("//*[@id='emailform']/button"));
//		JavascriptExecutor ss=(JavascriptExecutor)driver;
//		ss.executeScript("arguments[0].click();", ele);
;//			driver.manage().timeouts().implicitlyWait(1200000, TimeUnit.SECONDS);
//			//click on dottt
//			//driver.findElement(By.xpath("//*[@aria-label='Upload Resume']/../button")).click();
//			String file="C:\\Users\\chaut\\OneDrive\\Documents\\PANGIAMMOBILE(NOCITY)Relocated.docx";
//			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/section[2]/div[2]/div/div[1]/div/button")).sendKeys(file);
//			//*[@id="root"]/div/main/div/section[2]/div[2]/div/div[1]/div/button
		//*[text()='Upload resume']
	//	  driver.manage().timeouts().implicitlyWait(1200000, TimeUnit.SECONDS);
for(;;) {
		  driver.findElement(By.xpath("//*[text()='Upload resume']/..")).click();
		String file="C:\\Users\\chaut\\OneDrive\\Desktop\\toan\\minh.docx";
		
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
			Thread.sleep(6000);
			//wait for 15 minute //click on dot dot dot
			driver.findElement(By.xpath("//*[@aria-label='Upload Resume']/../button")).click();
			//*[text()='Delete']//click on delete after dropdown
			driver.findElement(By.xpath("//*[text()='Delete']")).click();
			//*[@id='modal-confirm-delete-modal']/div[3]/button[1]
			driver.findElement(By.xpath("//*[@id='modal-confirm-delete-modal']/div[3]/button[1]")).click();
			//driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div[2]/button[2]")).click();
}
     }
}
		  
		  


