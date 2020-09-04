package Utility;

import java.util.Map;
import test.Core.XmlReaderNew;

public class UserXML {

	public String strUserName;
	public String strPassword;
	
	

	static XmlReaderNew xml = new XmlReaderNew();

	public static UserXML Initialize(String key) {
		UserXML obj = new UserXML();

		try {

			Map map = XmlReaderNew.ReadXmlData("UserData", key);

			obj.strUserName = (String) map.get("UserName").toString();
			obj.strPassword = (String) map.get("Password").toString();
			
			
		} catch (Exception e) {
			System.out.println("Please check fields in UserData files!");
		}
		return obj;

	}

}
