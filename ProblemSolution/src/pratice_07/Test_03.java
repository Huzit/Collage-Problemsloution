package pratice_07;

import java.util.Arrays;

public class Test_03 {

	public static void main(String[] args) {
		int v[] = new int[] { 5, 8, 1, 9, 3, 5, 1, 5 };
		insertionSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void insertionSort(int[] v) {
		int x = v[0];
		for (int i = 1; i < v.length; i++) {
			if(v[i-1]>v[i]) x = v[i];
			
			for (int j = i; j > 0 && v[j - 1] > v[j]; j--) {
				v[j] = v[j - 1];
				v[j - 1] = x;
				System.out.println(Arrays.toString(v));
			}
		}
	}

}
