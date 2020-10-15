package ch1;

import java.util.HashMap;
import java.util.Map;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean answer = editCheck("pale", "ple");
		System.out.println("pale, ple ->"+answer);
		
		answer = editCheck("pales", "pale");
		System.out.println("pales, plale ->"+answer);
		
		answer = editCheck("pale", "bale");
		System.out.println("pale, bale ->"+answer);
		
		answer = editCheck("pale", "bake");
		System.out.println("pale, bake ->"+answer);
	}
	
	public static boolean editCheck(String s1, String s2) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for(int i = 0; i<s1.length(); i++) {
			char letter = s1.charAt(i);
			
			if(!map1.containsKey(letter))
				map1.put(letter, 1);
			else {
				int value = map1.get(letter);
				value++;
				map1.put(letter, value);
			}	
		}
		
		int size1 = map1.size();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for(int i = 0; i<s2.length(); i++) {
			char letter = s2.charAt(i);
			
			if(!map2.containsKey(letter))
				map2.put(letter, 1);
			else {
				int value = map2.get(letter);
				value++;
				map2.put(letter, value);
			}	
		}
		
		int size2 = map2.size();
		
		if(size2>(size1+1)||size2<(size1-1))
			return false;
		
		int numDif = 0;
		for(Map.Entry<Character, Integer> entry:map2.entrySet()) {
				if(!map1.containsKey(entry.getKey()))
					numDif +=1;
				else {
				if((entry.getValue()+map1.get(entry.getKey()))>(map1.get(entry.getKey())+1))
					return false;
				}
		}
		
		if(numDif>1)
			return false;
		
		return true;
		
		}
	}


