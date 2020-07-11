package com.portal.apiBase;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class PortalApiBase {
	
	@Test
	public void setUpNode() {
		given().when().get("http://ergast.com/api/f1/2017/circuits.json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and()
		.header("Content-Length",equalTo("4551"));
	
	}
	

}
