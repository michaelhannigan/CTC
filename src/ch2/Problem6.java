package ch2;

import java.util.Iterator;
import java.util.LinkedList;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Character> list1 = new LinkedList<>();
		LinkedList<Character> list2 = new LinkedList<>();
		
		String car = "racecar";
		
		for(int i = 0; i<car.length(); i++) {
			list1.add(car.charAt(i));
			if(i<car.length()-1)
				list2.add(car.charAt(i));
		}
		
		//test
		System.out.println(isPalindrome(list1));
		System.out.println(isPalindrome(list2));
		
		
		
		
	}

	
	public static boolean isPalindrome(LinkedList<Character> list1){
		
		Iterator i = list1.descendingIterator();
		int index = 0;
		while(i.hasNext()) {
			if(i.next()!= list1.get(index)) {
				return false;
			}
			index++;
		}
		
		
		return true;
	}
}
