package Utility;

import test.Core.*;

public class Configuration {

	static ReadProperties rp = new ReadProperties();

	public static String TestURL() {
		return ReadProperties.Properties("TestURL");
	}
	
}
