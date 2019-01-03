package pratice_01;

import java.util.Arrays;

public class Test_18 {
	public static void main(String[] args) {
		int n[] = { 5, 7, 9, 1, 3, 5, 8, 2, 4, 9 };
		int temp=0;
		
		for (int i = 0; i < n.length; i++) {
			for (int j= 0; j < n.length-1; j++) {
				if(n[j]<n[j+1]) {
					temp = n[j+1];
					n[j+1] = n[j];
					n[j]=temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(n));
	}
}