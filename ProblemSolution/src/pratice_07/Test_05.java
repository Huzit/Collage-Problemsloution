package pratice_07;

import java.util.Arrays;

public class Test_05 {

	public static void main(String[] args) {
		int v[] = { 1, 3, 5, 7, 8, 2, 4, 6, 7, 10 };
		mergeArray(v, 0, 4, 5, 9);
		System.out.println(Arrays.toString(v));
	}

	private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
		int k = 0, i=left1, j=left2;
		int[] m = new int[right2-left1+1];
		while (i <= right1 && j <= right2) m[k++] = (v[i] <= v[j]) ? v[i++] : v[j++];
		while (i <= right1)	m[k++] = v[i++];
		while (j <= right2)	m[k++] = v[j++];
		System.arraycopy(m, 0, v, 0, right2-left1+1);
}
}
