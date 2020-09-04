package pageObjects;


import java.io.File;

import java.time.Duration;
import java.time.Instant;
import Utility.Configuration;
import Utility.PageObjects;
import test.Core.LocatorObject;



/**
 * 
 * @summary Home page
 */

public class HomePage extends MasterPage {

	/**
	 * @param repository
	 * @summary parameterized constructor for Home Page
	 */
	public HomePage(PageObjects repository) {
		super(repository);
	}

	public HomePage atHomePage() {
		teststart = Instant.now();
		Action.OpenURl(Configuration.TestURL());
		return this;
	}

	

	

	

	public static LocatorObject Form_Link = new LocatorObject("//a[@class='nav-link']","Form link", LocatorObject.XPATH);
	public static LocatorObject Create_Email_Textbox = new LocatorObject("//input[@id='email_create']","Create Login email", LocatorObject.XPATH);
	public static LocatorObject Login_Email_Textbox = new LocatorObject("//input[@id='email']","Login email", LocatorObject.XPATH);
	public static LocatorObject Login_Password_Textbox = new LocatorObject("//input[@id='passwd']","Login password", LocatorObject.XPATH);
	public static LocatorObject Create_Button = new LocatorObject("//button[@id='SubmitCreate']","Create button", LocatorObject.XPATH);
	public static LocatorObject Login_Button = new LocatorObject("//button[@id='SubmitLogin']","Login button", LocatorObject.XPATH);
	
	public static LocatorObject Search_Textbox = new LocatorObject("//input[@id='search_query_top']","Search text box", LocatorObject.XPATH);
	public static LocatorObject Search_Button = new LocatorObject("//button[@name='submit_search']", "Search button",LocatorObject.XPATH);
	public static LocatorObject Search_Result_Heading_Label = new LocatorObject("//h1[@class='page-heading  product-listing']/span[1]", "Search result keyword heading",LocatorObject.XPATH);
	
	
	
	
	
	/**
	 * @return Total time taken for test case
	 */
	public HomePage CloseSession() {

		testend = Instant.now();
		Duration testDuration = Duration.between(teststart, testend);
		double min;
		min = (testDuration.toMillis() / 1000.0) / 60.0;
		double mili = testDuration.toMillis();
		Action.ActionLog("Time taken for the test: " + (Math.round(min * 100.0) / 100.0) + " Minutes");
		return this;
	}
	/**
	 * @return Navigate to contact page
	 */
	public HomePage NavigatetoForm() {
		Action.Click(Form_Link);
		Action.WaitForPageLoad();
		if(Action.GetCurrentUrl().contains("form"))
			Action.ActionLog("Navigated to "+Action.GetPageTitle()+" Page");
		else
			Action.AssertFail("Navigation to Form failed");	
		return this;
	}
	/**
	 * @param strSearchKeyword
	 * @return Enter the search keyword on the home page search text box
	 */
	public HomePage Search(String strSearchKeyword) {
		
		Action.enterText(Search_Textbox, strSearchKeyword);
		Action.Click(Search_Button);
		return this;
	}
	
	
	
}
