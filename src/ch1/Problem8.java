package ch1;

import java.util.Random;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r1 = new Random();
		Random r2 = new Random();
		int m = r1.nextInt(5);
		int n = r2.nextInt(5);
		
		int[][] matrix = new int[m][n];
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				matrix[i][j] = new Random().nextInt(10);
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
