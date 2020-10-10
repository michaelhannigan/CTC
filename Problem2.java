package ch1;

import java.util.HashMap;
import java.util.HashSet;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abab";
		String s2 = "baab";
		
		if(permutation(s1,s2)) 
			System.out.print("This is a permutaiton");
		else
			System.out.print("This is not a permutation");
		
		
		
		
		

	}
	
	public static boolean permutation(String s1, String s2) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();	
	for(int i = 0; i<s1.length(); i++) {
		if(map1.containsKey(s1.charAt(i))) {
			int newValue = map1.get(s1.charAt(i))+1;
			map1.replace(s1.charAt(i),  newValue);
		}
		else
			map1.put(s1.charAt(i), 1);
	}
	
	for(int i = 0; i<s2.length(); i++) {
		if(map2.containsKey(s2.charAt(i))) {
			int newValue = map2.get(s2.charAt(i))+1;
			map2.replace(s2.charAt(i),  newValue);
			
		}
		else
			map2.put(s2.charAt(i), 1);
			
		
	}
	
	for(int i = 0; i<s1.length(); i++) {
		if(!map2.containsKey(s1.charAt(i)))
			return false;
		if(map1.get(s1.charAt(i))!=map2.get(s1.charAt(i))) {
			return false;
		}
	}
	
	return true;
	

}
}
