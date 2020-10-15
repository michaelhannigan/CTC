package ch1;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Mr John Smith    ";
		int num = 13;
		System.out.print(URLify(test, 13));
		

	}
	public static String URLify(String s, int n) {
		String sfinal = "";
		for(int i = 0; i<n;i++) {
			if(s.charAt(i)==' ')
				sfinal += "%20";
			else
				sfinal += s.charAt(i);
		}
		
		return sfinal;
	}
}


