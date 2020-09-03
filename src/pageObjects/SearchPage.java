package pageObjects;

import Utility.PageObjects;
import test.Core.LocatorObject;

public class SearchPage extends MasterPage {
	/**
	 * @param repository
	 * @summary parameterized constructor for Home Page
	 */
	public SearchPage(PageObjects repository) {
		super(repository);
	}

	public SearchPage atSearchPage() {

		return this;
	}

	public static LocatorObject Search_Result_Heading_Label = new LocatorObject("//h1[@class='page-heading  product-listing']/span[1]", "Search heading",LocatorObject.XPATH);
	public static LocatorObject Search_Result_Label = new LocatorObject("//h1[@class='page-heading  product-listing']/span[1]", "Search results",LocatorObject.XPATH);
	
	
	/**
	 * @param strSearchKeyword
	 * @return Verify the search results heading for the search keyword
	 */
	public SearchPage VerifySearchResult(String strSearchKeyword) {
		Action.ActionLog("Expected Result: Verify the seach result page should display items for search keyword");
		if(Action.GetText(Search_Result_Heading_Label).contains(strSearchKeyword))
			Action.ActionLog(Action.GetText(Search_Result_Heading_Label));
		else
			Action.AssertFail("Actual Result: Search result verification failed");
		return this;
	}
}
