package rest.apirest.test;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class QUERYPARAMETERRequest {
 
 @Test
        public void queryParameter() {
 
 RestAssured.baseURI ="https://reqres.in/api/users/2"; 
 RequestSpecification request = RestAssured.given();
 
 Response response = request.queryParam("q", "London,UK") 
                    .queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8") 
                    .get("/weather");
 
 String jsonString = response.asString();
 System.out.println(response.getStatusCode()); 
 Assert.assertEquals(jsonString.contains("London"), true);
 
 }
}
 

