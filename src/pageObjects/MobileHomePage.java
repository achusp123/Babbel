package pageObjects;

import java.time.Duration;
import java.time.Instant;

import Utility.PageObjects;
import test.Core.LocatorObject;
import test.Core.MobileAction;


public class MobileHomePage extends MasterPage {
	
	public MobileHomePage(PageObjects repository) {
		super(repository);
	}
	
	public MobileHomePage atMobileHomePage() {
		teststart = Instant.now();
		return this;
	}
	public static Instant start;
	public static Instant end;
	public static LocatorObject Mobile_Home_Login_Textbox = new LocatorObject("com.github.fgoncalves.qa:id/email", "user name", LocatorObject.ID);
	public static LocatorObject Mobile_Home_Password_Textbox = new LocatorObject("com.github.fgoncalves.qa:id/password", "password", LocatorObject.ID);
	public static LocatorObject Mobile_Home_Signin_Button = new LocatorObject("com.github.fgoncalves.qa:id/email_sign_in_button", "sign in", LocatorObject.ID);
	public static LocatorObject Mobile_Home_Clickhere_Button = new LocatorObject("com.github.fgoncalves.qa:id/OutOfHomeBtn", "click here", LocatorObject.ID);
	public static LocatorObject Mobile_Home_Message_Label = new LocatorObject("com.github.fgoncalves.qa:id/randomTextView", "welcome message", LocatorObject.ID);
	
	public MobileHomePage VerifyLogin(String user, String password) {
		MobileAction.Click(Mobile_Home_Login_Textbox);
		MobileAction.enterText(Mobile_Home_Login_Textbox, user);
		MobileAction.ActionLog("Log in user name entered");
		MobileAction.Click(Mobile_Home_Password_Textbox);
		MobileAction.enterText(Mobile_Home_Password_Textbox, password);
		MobileAction.ActionLog("Login password entered");
		MobileAction.Click(Mobile_Home_Signin_Button);
		MobileAction.ActionLog("Clciked on sigin button");
		MobileAction.Click(Mobile_Home_Clickhere_Button);
		MobileAction.ActionLog("Logged in to home page successfully");
		if(MobileAction.GetText(Mobile_Home_Message_Label).contains("Welcome"))
			MobileAction.ActionLog("Login fuction successfully verified");
		else
			MobileAction.AssertFail("Login functinality failed");
		return this;
	}
	
	/**
	 * @return Total time taken for test case
	 */
	public MobileHomePage CloseSession() {

		testend = Instant.now();
		Duration testDuration = Duration.between(teststart, testend);
		double min;
		min = (testDuration.toMillis() / 1000.0) / 60.0;
		double mili = testDuration.toMillis();
		Action.ActionLog("Time taken for the test: " + (Math.round(min * 100.0) / 100.0) + " Minutes");
		return this;
	}
	
}
