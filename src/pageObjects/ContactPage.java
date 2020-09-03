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

	public static LocatorObject Contact_Subject_Dropdown = new LocatorObject("//div[@class='selector']/select","Contact subject", LocatorObject.XPATH);
	public static LocatorObject Contact_Email_Textbox = new LocatorObject("//input[@id='email']","Contact email", LocatorObject.XPATH);
	public static LocatorObject Contact_Order_Textbox = new LocatorObject("//input[@id='id_order']","Contact order number", LocatorObject.XPATH);
	public static LocatorObject Contact_Message_TextArea = new LocatorObject("//textarea[@id='message']", "Contact Message",LocatorObject.XPATH);
	public static LocatorObject Contact_Send_Button = new LocatorObject("//button[@id='submitMessage']","Contact send button", LocatorObject.XPATH);
	public static LocatorObject Contact_Error_Label = new LocatorObject("//div[@class='alert alert-danger']/ol/li", "Contact error message", LocatorObject.XPATH);
	public static LocatorObject Contact_Success_Label = new LocatorObject("//p[@class='alert alert-success']", "Contact success message", LocatorObject.XPATH);
	
	
	/**
	 * @param strSubject
	 * @param strEmail
	 * @param strOrder
	 * @param strMessage
	 * @return Verify the message can be send to the customer care including the negative tests for the fields 
	 */
	public ContactPage VerifyContactUs(String strSubject,String strEmail, String strOrder, String strMessage) {
		Action.ActionLog("Expected Result: Verify the message can be send to customer service.");
		Action.Click(Contact_Send_Button);
		if(Action.GetText(Contact_Error_Label).contains("Invalid email address."))
			Action.ActionLog("Blank or invalid email address verified successfully");
		Action.enterText(Contact_Email_Textbox, strEmail);
		Action.Click(Contact_Send_Button);
		if(Action.GetText(Contact_Error_Label).contains("The message cannot be blank."))
			Action.ActionLog("Black message verified successfully");
		Action.enterText(Contact_Message_TextArea, strMessage);
		Action.Click(Contact_Send_Button);
		if(Action.GetText(Contact_Error_Label).contains("Please select a subject from the list provided."))
			Action.ActionLog("Black Subject verified successfully");
		Action.SelectdropdrownValueByVisibleText(Contact_Subject_Dropdown, "Customer service");
		Action.Click(Contact_Send_Button);
		Action.enterText(Contact_Order_Textbox, strOrder);
		Action.Click(Contact_Send_Button);
		if(Action.GetText(Contact_Success_Label).contains("Your message has been successfully sent to our team."))
			Action.ActionLog("Actual Result: The query send o customer service successsfully");
		else
			Action.AssertFail("Actual Result: The message sent to customer service failed.");
		return this;
	}
}
