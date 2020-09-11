package com.he.addressBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {

	
	public static boolean isValidLable(String label) {
		if(label == null || label.isEmpty() || exceedLength(label)) {
    		return false;
    	}
		Pattern p = Pattern.compile("^[ A-Za-z]+$");
		Matcher m = p.matcher(label);
		return m.matches();
	}
	
	
	public static boolean isValidPhoneNumber(String num) {
		Pattern p = Pattern.compile("\\d{10}");
		Matcher m = p.matcher(num);
		return m.matches();
	}
	
	public static boolean isStringNull(String string) {
		return string == null;
	}
	
	
	public static boolean exceedLength(String label) {
		return label != null && (label.length() > 255);
	}
}
