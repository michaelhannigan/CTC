package ch1;

import java.util.HashMap;
import java.util.Map;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString  = "aabcccccaaa";
		System.out.print(countChars(testString));
		

	}
	
	static public String countChars(String s) {
		
		String newString = "";
		int count = 1;
		char temp = '!';
		
		//goes character by character already counting the first character
		//looks back
		for(int i = 1; i<s.length(); i++) {
			temp = s.charAt(i-1);
			if(temp!=s.charAt(i)) {
				newString = newString + s.charAt(i-1) + count;
				count = 1;
			}
			else 
				count++;
		}
		
		//gets the last character after the loop exits
		newString = newString + s.charAt(s.length()-1) + count;

		if(newString.length()<s.length())
			return newString;
		else
			return s;
				
	}

}
