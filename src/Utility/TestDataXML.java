package Utility;

import java.util.Map;
import test.Core.XmlReaderNew;

public class TestDataXML {

	public String strFirst;
 	public String strLast;
 	public String strJob;
 	public String strEducation;
 	public String strSex;
 	public String strExperience;
 	public String strDate;
 	
 
 	static XmlReaderNew xml = new XmlReaderNew();
 
 	public static TestDataXML Initialize(String key) {
 		TestDataXML obj = new TestDataXML();
 
 		try {
 			Map map = XmlReaderNew.ReadXmlData("TestData", key);
 
 			obj.strFirst = (String) map.get("First").toString();
 			obj.strLast = (String) map.get("Last").toString();
 			obj.strJob = (String) map.get("Job").toString();
 			obj.strEducation = (String) map.get("Education").toString();
 			obj.strSex = (String) map.get("Sex").toString();
 			obj.strExperience = (String) map.get("Experience").toString();
 			obj.strDate = (String) map.get("Date").toString();
 			
 		} catch (Exception e) {
 			e.printStackTrace();
 			System.out.println("Please check fields in TestData files!");
 		}
 		return obj;
 
 	}

}
