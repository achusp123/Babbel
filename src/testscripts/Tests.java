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
	 * Description : Verification of submission of form 
	 * 
	 * 
	 * ------------------------------------------------------------
	 *
	 ****************************************************************************************************/
	@Test(groups = {  "Demo" }, description = "Verification of submit form ", enabled = true)
	public static void Validation_Of_Form_Submission() {

		Begin begin = new Begin();

		begin
			.Start()
			.GetHomePage()
			.atHomePage()
			.NavigatetoForm()
			.GetContactPage()
			.atContactPage()
			.VerifyFormSubmit(TestData.strFirst, TestData.strLast, TestData.strJob, TestData.strEducation,TestData.strSex,TestData.strExperience,TestData.strDate)
			.GetHomePage()
			.CloseSession();
	}
}
