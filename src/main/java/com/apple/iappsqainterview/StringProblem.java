package com.apple.iappsqainterview;

public class StringProblem {

	public String removeCharUsingIteration(final String str, final char ch) {
		if(str == null) {
			return null;
		}
		String finalString = "";
		for(int i=0;i<str.length();i++) {
			final char charAtI = str.charAt(i);
			if(charAtI != ch) {
				finalString += charAtI;
			}
		}
		return finalString;
	}
	
	public String removeCharUsingAPI(final String str, final char ch) {
		if(str == null) {
			return null;
		}
		return str.replaceAll(ch+"", "");
	}
}
