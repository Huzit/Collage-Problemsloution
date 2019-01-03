package pratice_07;

import java.util.Arrays;

public class Test_06 {

	public static void main(String[] args) {
		int v[] = new int[] { 8, 5, 9, 1, 5, 3, 5, 1 };
		mergeSort(v, 0, v.length - 1);
		System.out.println(Arrays.toString(v));
	}

	private static void mergeSort(int[] v, int left, int right) {
		if (left == right)
			return;
		int m = (left + right) / 2;
		mergeSort(v, left, m);
		mergeSort(v, m + 1, right);
		mergeArray(v, left, m, m + 1, right);
	}
	private static void mergeArray(int[] v, int left1, int right1, int left2, int right2) {
		int k = 0, i=left1, j=left2;
		int[] m = new int[right2-left1+1];
		while (i <= right1 && j <= right2) m[k++] = (v[i] <= v[j]) ? v[i++] : v[j++];
		while (i <= right1)	m[k++] = v[i++];
		while (j <= right2)	m[k++] = v[j++];
		//전과같이 0으로 할병우 마지막과정에서 overwrite가 일이나서 535351이 두번나왔던 거시다
		System.arraycopy(m, 0, v, left1, right2-left1+1);
	}

}
