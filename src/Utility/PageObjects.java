package Utility;

import pageObjects.*;

public class PageObjects {

	

	public HomePage GetHomePage() {
		return new HomePage(this);

	}
	public MobileHomePage GetMobileHomePage() {
		return new MobileHomePage(this);

	}
	public ContactPage GetContactPage() {
		return new ContactPage(this);

	}

	
}