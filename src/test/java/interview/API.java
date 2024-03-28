package interview;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

/*
 * Feature: Create new user in Gorest API

@CreateUser @ApiRegression
Scenario Outline: Create User

Given User create request data with "<name>" , "<email>" , "<gender>" , "<status>"
When User sumbits POST request to GOREST api
And User validates if statusCode is 201
Then User retrieves userID from response 
And User deletes data with userID

Examples:
|name     |email   					  |gender   | status |
|Mr.API   |apiTest@yoll.io    |male     |active  |
 * 
 * 
 */

public class API {
	
@Test
 public static void gorest() throws Exception {

	      //create data
	ExcelUtility.setExcelFile("src\\test\\resources\\hi.xlsx", "Sheet1");
	ExcelUtility.getCellData(1, 3);
		
	}
	
	
}
	
	 
 
		
		
	


