package interview;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class WritePostRequest {
	String url="";
	
	public Response submitPostRequest(Object reqBuilder) {
		
		Response response=            given()
				                       .contentType(ContentType.JSON)
				                       .header("","")//token
				                       .body(reqBuilder)
				                       .when()
				                       .post(url);//tokenURL
				                
				                 response.prettyPrint();
				     
				     return response;
				         
		
		
		
		
		
		
		
		
	}
	
	

}
