package ATpkg;

import java.util.HashMap;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class UpdateProject 
{	
	@Test
	public void updateprojectTest()
	{
		HashMap<String,Object> map=new HashMap<>();
		map.put("createdBy","PC");
		map.put("createdOn","12/08/2020");
		map.put("projectId","TY_01");
		map.put("projectName","Google");
		map.put("status","Ongoing");
		map.put("teamSize",5);
		
		given()
		   .contentType(ContentType.JSON)
		    .baseUri("http://localhost")
		   .port(8084)
		   .body(map)
	        .when()
		.put("/projects/TY_PROJ_402")
		   .then()
		    .assertThat().statusCode(200)
		    .and()
		    .log().all();
	}
}
