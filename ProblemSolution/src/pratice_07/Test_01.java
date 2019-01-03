package pratice_07;

import java.util.Arrays;

public class Test_01 {
	public static void main(String[] args) {
		int v[] = new int[] { 1, 2, 3, 4, 3, 2, 1};
		bubbleSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void bubbleSort(int[] v) {
		boolean count=false;
		for (int i = 0; i < v.length; i++) {
			for (int j = 1; j < v.length-i; j++) {
				if (v[j - 1] > v[j]) {
					int temp = v[j];
					v[j] = v[j - 1];
					v[j - 1] = temp;
					count=true;
				}
			}
			if(!count) return;
		}
	}
}
