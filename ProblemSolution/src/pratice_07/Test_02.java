package pratice_07;

import java.util.Arrays;

public class Test_02 {

	public static void main(String[] args) {
		int v[] = new int[] { 9, 8, 7, 6, 5, 4, 3, 2 };
		selectionSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void selectionSort(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[min] > v[j])
					min = j;
			}
			if (min != i) {
				int x = v[i];
				v[i] = v[min];
				v[min] = x;
			}
			
		}
	}

}
