package ATpkg;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetSingleProject 
{
	@Test
 public void getSingleProject()
 {
	  given()
	  .contentType(ContentType.JSON)
	  .baseUri("http://localhost")
	  .port(8084)
	  
	  .when();
	  
	  
 }
}
