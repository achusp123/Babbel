package pageObjects;

import Utility.PageObjects;
import test.Core.LocatorObject;

public class ContactPage extends MasterPage {
	
	/**
	 * @param repository
	 * @summary parameterized constructor for Home Page
	 */
	public ContactPage(PageObjects repository) {
		super(repository);
	}

	public ContactPage atContactPage() {

		return this;
	}
	int i=0;
	
	public static LocatorObject Contact_Firstname_Textbox = new LocatorObject("//input[@id='first-name']","First name", LocatorObject.XPATH);
	public static LocatorObject Contact_Lastname_Textbox = new LocatorObject("//input[@id='last-name']","Last name", LocatorObject.XPATH);
	public static LocatorObject Contact_Jobtitle_Textbox = new LocatorObject("//input[@id='job-title']","Job title", LocatorObject.XPATH);
	public static LocatorObject Contact_Yearofexp_Dropdown = new LocatorObject("//div[@class='form-group']/div[6]/select","Year of experience", LocatorObject.XPATH);
	
	public static LocatorObject Contact_Date_Textbox = new LocatorObject("//div[@class='form-group']/div[7]/input","Date", LocatorObject.XPATH);
	
	public static LocatorObject Contact_Submit_Button = new LocatorObject("//div[@class='form-group']/div[8]/a", "Submmit btton", LocatorObject.XPATH);
	public static LocatorObject Contact_Message_Label = new LocatorObject("//div[@class='alert alert-success']", " message", LocatorObject.XPATH);
	
	/**
	 * @param strSubject
	 * @param strEmail
	 * @param strOrder
	 * @param strMessage
	 * @return Verify the message can be send to the customer care including the negative tests for the fields 
	 */
	public ContactPage VerifyFormSubmit(String First,String Last, String Job, String Education, String Sex, String Experience,String Date) {
		Action.ActionLog("Expected Result: Verify the form is subnmitted succesfully");
		Action.enterText(Contact_Firstname_Textbox, First);
		Action.ActionLog("First name entered "+First);
		Action.enterText(Contact_Lastname_Textbox, Last);
		Action.ActionLog("Last name entered "+Last);
		Action.enterText(Contact_Jobtitle_Textbox, Job);
		Action.ActionLog("Job title entered "+Job);
		switch(Education){
		case "High School":
			i=2;
			break;
		case "College":
			i=3;
			break;
		case "Grad School":
			i=4;
			break;
		}
		LocatorObject Contact_Education_Radiobutton = new LocatorObject("//div[@class='form-group']/div[4]/div["+i+"]/input", "Contact error message", LocatorObject.XPATH);
		Action.Click(Contact_Education_Radiobutton);
		Action.ActionLog("Education selected "+Education);
		switch(Sex){
		case "Male":
			i=2;
			break;
		case "Female":
			i=3;
			break;
		case "Prefer not to say":
			i=4;
			break;
		}
		LocatorObject Contact_Sex_Check = new LocatorObject("//div[@class='form-group']/div[5]/div["+i+"]/input", "Contact Message",LocatorObject.XPATH);
		Action.Click(Contact_Sex_Check);
		Action.ActionLog("Sex selected "+Sex);
		Action.SelectdropdrownValueByVisibleText(Contact_Yearofexp_Dropdown, Experience);
		Action.ActionLog("Selected year of experience "+Experience);
		Action.enterText(Contact_Date_Textbox, Date);
		Action.ActionLog("Date enetered "+Date);
		Action.Click(Contact_Submit_Button);
		Action.ActionLog("Clicked on submit button");
		if(Action.GetText(Contact_Message_Label).contains("The form was successfully submitted!"))
			Action.ActionLog("Actual Result: The form submitted successfully");
		else
			Action.AssertFail("Actual Result: Form submission failed");
		return this;
	}
}
