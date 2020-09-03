package Utility;

import pageObjects.*;

public class Begin {

	PageObjects repository = new PageObjects();

	public HomePage Start() {

		return this.repository.GetHomePage();
	}

}
