package pratice_06;

import java.util.Arrays;

public class Test_19 {

	public static void main(String[] args) {
		int n[]= {3, 4};
		System.out.println(Arrays.toString(n));
		swap(0, 1, n);
		System.out.println(Arrays.toString(n));
	}
	private static void swap(int i, int j, int[] n) {
		int temp=0;
		temp=n[1];
		n[1]=n[0];
		n[0]=temp;
		
	}

}
