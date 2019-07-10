package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@Test(dataProvider="fetchdata")
	public void createLead(String company,String fName,String lName) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
	}
	
	@DataProvider(name="fetchdata")
	public String[][] getData() {
		String[][] data=new String[2][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="Prasad";
		
		data[1][0]="TestLeaf";
		data[1][1]="Balaji";
		data[1][2]="Ram";
		
		return data;

	}

}
