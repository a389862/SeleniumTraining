package testng;

import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {
	@Test
	public void deleteLead() {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//table[@class='x-grid3-row-table']//tr//div/a").click();
		driver.findElementByLinkText("Delete").click();
	}

}
