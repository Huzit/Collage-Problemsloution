package pratice_02;

import java.util.Arrays;

public class Test_10 {

	public static void main(String[] args) {
		int n[] = {3, 4, 5, 6, 7, 0, 0, 0, 0, 0};
		
		for (int i = 0; i<n.length-1 ; i++) 
			n[i] = n[i+1];
		
		System.out.println(Arrays.toString(n));
	}

}
