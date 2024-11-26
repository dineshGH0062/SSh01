package Demo.mvnproject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProTest {
	
	@Test(dataProvider = "getData")
	public void loginTest(String username, String password) {
		System.out.println("User got successfully logged in in useing username: "+ username+"and password"+ password);;

}
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[3][2];
		data[0][0]="Dinesh";
		data[0][1]="12345";
		
		data[1][0]="Kumar";
		data[1][1]="12345";
		
		data[2][0]="Tsting";
		data[2][1]="12345";
		return data;
		
		
	}
}