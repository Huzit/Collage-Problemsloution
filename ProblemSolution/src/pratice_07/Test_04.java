package pratice_07;

import java.util.Arrays;

public class Test_04 {

	public static void main(String[] args) {
		int n[] = { 1, 3, 5, 7, 8 };
		int m[] = { 2, 4, 6, 7, 10 };
		int v[] = mergeArray(n, m);
		System.out.println(Arrays.toString(v));

	}

	private static int[] mergeArray(int[] n, int[] m) {
		int i = 0, j = 0, k = 0;
		int[] v = new int[n.length + m.length];
		
		while (i < n.length && j < m.length) {
			v[k++]=(n[i] < m[j])? n[i++] : m[j++];
		}
		// n의 원소를 다 썼을경우
			while (j < m.length)
				v[k++] = m[j++];
		// m의 원소를 다 섰을경우
			while (i < n.length)
				v[k++] = n[i++];

		return v;
	}
}
