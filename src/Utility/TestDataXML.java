package Utility;

import java.util.Map;
import test.Core.XmlReaderNew;

public class TestDataXML {

	public String strSearchKeyword;
 	public String strContactSubject;
 	public String strContactEmail;
 	public String strContactOrder;
 	public String strContactMessage;
 	
 
 	static XmlReaderNew xml = new XmlReaderNew();
 
 	public static TestDataXML Initialize(String key) {
 		TestDataXML obj = new TestDataXML();
 
 		try {
 			Map map = XmlReaderNew.ReadXmlData("TestData", key);
 
 			obj.strSearchKeyword = (String) map.get("SearchKeyword").toString();
 			obj.strContactSubject = (String) map.get("ContactSubject").toString();
 			obj.strContactEmail = (String) map.get("ContactEmail").toString();
 			obj.strContactOrder = (String) map.get("ContactOrder").toString();
 			obj.strContactMessage = (String) map.get("ContactMessage").toString();
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 			System.out.println("Please check fields in TestData files!");
 		}
 		return obj;
 
 	}

}
