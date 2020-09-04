package pageObjects;

import java.time.Instant;


import Utility.Configuration;
import Utility.PageObjects;
import test.Core.*;

public class MasterPage {

	protected PageObjects repository;
	static Action Action = new Action();
	static MobileAction MobileAction = new MobileAction();
	Configuration configuration = new Configuration();

	public static Instant teststart;
	public static Instant testend;
	

	String[] linkTexts;
	static int i=1;
	String str;
	
	
	public MasterPage(PageObjects repository) {
		this.repository = repository;
	}

	public HomePage GetHomePage() {
		return repository.GetHomePage();

	}
	public MobileHomePage GetMobileHomePage() {
		return repository.GetMobileHomePage();

	}
	public ContactPage GetContactPage() {
		return repository.GetContactPage();
	}


	
	
	
	
	
}

