package ch1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 3;
		
		int[][] m = new int[size][size];
		
		int counter = 0;
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size; j++) {
				m[i][j] = counter;
				System.out.print(m[i][j]+" ");
				counter++;
			}
			System.out.println();
		}
		System.out.println("\nThe matrix above rotated 90 degrees is below \n\n");
		
		rotateMatrix(m);
		
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	static int[][] rotateMatrix(int[][] m){
		Stack<int[]> stack = new Stack<int[]>();
		
		for(int i = 0; i<m.length; i++) {
			int[] row = new int[m.length];
			
			for(int j = 0; j<m.length; j++) {
				row[j] = m[i][j];
			}
			stack.add(row);
		}
		
		for(int i = 0; i<m.length; i++) {
			for(int j = 0; j<m.length; j++) {
				m[j][i] = stack.peek()[j];
			}
			stack.pop();
		}
		
		return m;
			
	}

}
