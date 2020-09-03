package Utility;

import pageObjects.*;

public class PageObjects {

	

	public HomePage GetHomePage() {
		return new HomePage(this);

	}
	public ContactPage GetContactPage() {
		return new ContactPage(this);

	}
	public SearchPage GetSearchPage() {
		return new SearchPage(this);

	}
}