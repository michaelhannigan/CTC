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
		for(int i = 1; i<s.length(); i++) {
			temp = s.charAt(i-1);
			if(temp!=s.charAt(i)) {
				newString = newString + s.charAt(i-1) + count;
				count = 1;
			}
			else 
				count++;
			
			
			
		}
		
		newString = newString + s.charAt(s.length()-1) + count;
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//			
//		for(int i = 0; i<s.length(); i++) {
//			char letter = s.charAt(i);
//			if(!map.containsKey(letter)) 
//				map.put(letter, 1);
//			else {
//				int temp = map.get(letter)+1;
//				map.put(letter, temp);
//			}
//		}
//		
//		String newString = "";
//		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
//			newString+=entry.getKey();
//			newString+=entry.getValue();
//		}
//		
		if(newString.length()<s.length())
			return newString;
		else
			return s;
				
	}

}
