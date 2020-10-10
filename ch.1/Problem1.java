package ch1;

import java.util.*;

public class Problem1 {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 boolean repeat = false;
		 String input = scan.nextLine();
		 HashSet<Character> set = new HashSet<Character>();
		 for(int i = 0; i<input.length();i++) {
			 if(set.contains(input.charAt(i))) {
				 repeat = true;
			 }
			 set.add(input.charAt(i));
		 }
		 
		 if(repeat == true) 
			 System.out.print("THERE IS A REPEAT");
		 else
			 System.out.print("THERE IS NOT A REPEAT");
		 
	 }
	 
	 
	 
	
}
