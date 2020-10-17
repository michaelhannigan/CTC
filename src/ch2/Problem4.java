package ch2;

import java.util.LinkedList;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(5);
		list.add(10);
		list.add(2);
		list.add(1);
		
		
		listPartition(list, 5);
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
	
	public static <E extends Comparable<E>> LinkedList<E> listPartition(LinkedList<E> list, E e){
		
		for(int i = 0; i<list.size(); i++) {
//			System.out.println(e);
//			System.out.println(list.get(i));
			if(list.get(i).compareTo(e)<0) {
				E removed = list.remove(i);
				list.addFirst(removed);
			}
			else {
				E removed = list.remove(i);
				list.addLast(removed);
			}
		}
		
		return list;
	}
	
	
	
	

}
