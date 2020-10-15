package ch2;

import java.util.LinkedList;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Character> list = new LinkedList<Character>();
		char start = 'a';
		for(int i = 0; i<7; i++) {
			list.add(start);
			start++;
		}
		
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i));
		
		deleteMiddleNode(list);
		
		System.out.println();
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i));
		
		
	}
	
	public static <E> void deleteMiddleNode(LinkedList<E> list) {
		int middleNode = list.size()/2;
		
		list.remove(middleNode);
	}

}
