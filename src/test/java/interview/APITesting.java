package interview;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.http.ContentType;

public class APITesting {
	
	
    @Test
	public void submitGetExpense() {
    	Map<String,Object>map;
    	Response resp=given()
    			.header("Authorization","Bearer "+ConfigurationReader.getProperty("mealB.properties", "mealb_token"))
    			.when()
    			.get("http://dev-mb.yoll.io/api/expenses");
    	resp.prettyPrint();
    	
    map=JsonPath.read(resp.asString(),"$.result[0]");   
    		System.out.println(map.keySet());
 
    		
    		
    		
    		
    		
    	
    
   	
    	
		
	}

	}


