package com.pragim.regapp.utility;

public class RegUtility {

	public static String convertStringArrayIntoString(String[] data) {

		StringBuffer stringBuf = new StringBuffer();
		for (String obj : data) {
			stringBuf.append(obj).append(",");
		}
		String finalList = stringBuf.substring(0, stringBuf.length() - 1);
		return finalList;
	}

}
