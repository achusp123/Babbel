package testscripts;

import org.testng.annotations.Test;

import test.Core.TestBase;
import Utility.Begin;
import Utility.TestDataXML;
import Utility.UserXML;

public class Tests extends TestBase {
	static TestDataXML TestData = TestDataXML.Initialize("TestData");
	
	
	/*****************************************************************************************************
	 * Name : Validation_Of_ContactUs_Send_Message
	 *
	 * Description : Verification of send message functionality on contact us page 
	 * 
	 * 
	 * ------------------------------------------------------------
	 *
	 ****************************************************************************************************/
	@Test(groups = {  "Demo" }, description = "Verification of send message functionality on contact us page", enabled = true)
	public static void Validation_Of_ContactUs_Send_Message() {

		Begin begin = new Begin();

		begin
			.Start()
			.GetHomePage()
			.atHomePage()
			.NavigatetoContact()
			.GetContactPage()
			.atContactPage()
			.VerifyContactUs(TestData.strContactSubject, TestData.strContactEmail, TestData.strContactOrder, TestData.strContactMessage)
			.GetHomePage()
			.CloseSession();
	}
}
