package ch1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p = "cato catt";
		System.out.print(isPalPerm(p));

	}
	

public static boolean isPalPerm(String s) {
	String[] splitString = s.split(" ");
	s = "";
	for(String token:splitString)
		s+=token;
	
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(int i = 0; i<s.length(); i++) {
		if(map.containsKey(s.charAt(i))) {
			int oldValue = map.get(s.charAt(i));
			int newValue = oldValue+1;
			map.replace(s.charAt(i), oldValue, newValue);
		}
		else {
			map.put(s.charAt(i), 1);
		}
	}
	int oddCounter = 0;
	for(HashMap.Entry<Character, Integer> entry :map.entrySet()) {
		if(entry.getValue()%2!=0)
			oddCounter++;
	}
	
	if(oddCounter<2)
		return true;	
	
	return false;
}

}
