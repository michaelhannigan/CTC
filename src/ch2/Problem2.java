package ch2;

import java.util.LinkedList;



public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Character> list = new LinkedList<Character>();
		char start = 'A';
		list.add(start);
		for(int i = 1; i<25; i++) {
			start++;
			list.addLast(start);
		}
			
		System.out.println(kthElement(list, 3));
		
		
	}
	
	
	public static <E> E kthElement(LinkedList<E> list, int index) {
		
		int k = list.size()-index;
		
		return list.get(k);
		
	}

}
