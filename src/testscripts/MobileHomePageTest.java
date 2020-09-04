package testscripts;

import org.testng.annotations.Test;

import Utility.Begin;

import Utility.UserXML;
import test.Core.TestBase;

public class MobileHomePageTest extends TestBase {
	
static UserXML TestData = UserXML.Initialize("UserData");
	
	
	/*****************************************************************************************************
	 * Name : Validation_Of_ContactUs_Send_Message
	 *
	 * Description : Verification of mobile login 
	 * 
	 * 
	 * ------------------------------------------------------------
	 *
	 ****************************************************************************************************/
	@Test(groups = {  "Demo" }, description = "Verification of mobile login", enabled = true)
	public static void Validation_Of_Login() {

		Begin begin = new Begin();

		begin
			.Start()
			.GetMobileHomePage()
			.atMobileHomePage()
			.VerifyLogin(TestData.strUserName, TestData.strPassword)
			.CloseSession();
	}

}
