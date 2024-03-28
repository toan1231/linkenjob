package interview;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ProtonInterview {
	
    WebDriver driver;
    @Test
	public void money() throws InterruptedException, AWTException {
   
   	  	 WebDriverManager.chromedriver().setup();
    	  driver=new ChromeDriver();
    	  driver.manage().window().maximize();
    	  
 

}
    
}
