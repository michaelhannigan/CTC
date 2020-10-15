package ch2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Character> list = new LinkedList<Character>();
		String input = "Follow Up";
		
		for(int i=0; i<input.length(); i++) 
			list.add(input.charAt(i));
		
		removeDups(list);
		
		String output = "";
		
		for(int i = 0; i<list.size(); i++)
			output+=list.get(i);
		
		System.out.print(output);
	
	}
	
	public static <E> LinkedList<E> removeDups(LinkedList<E> list) {
		HashSet<E> set = new HashSet<E>();
		
		for(int i = 0; i<list.size(); i++) {
			E curr = list.get(i);
			if(!set.contains(curr))
				set.add(curr);
			else
				list.remove(i);
		}
		
		return list;
	}

}
