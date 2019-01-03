package pratice_08;

import java.util.Arrays;

public class Test_03 {
	public static void main(String[] args) {
		int v[] = { 2, 3, 6, 8, 9 };
		Arrays.sort(v); // 배열 정렬
		int key = 8;
		int index = recursiveSearch(v, key, 0); // 정렬된 배열 내 자료 위치 이진 탐색
		if (index < 0)
			System.out.println("배열 내 자료 없음");
		else
			System.out.println("자료 발견 위치(배열 내 index): " + index);
	}

	private static int binarySearch(int[] v, int key) {
		int left = 0, right = v.length - 1;
		while (left <= right) {
			int m = left + (right / 2);
			if (key == v[m])
				return m;
			if (key < v[m])
				right = m - 1;
			else
				left = m + 1;
		}
		return -1;
	}
	
	private static int recursiveSearch(int[] v, int key, int left) {
		if(left==v.length) return -1;
		return	v[left] == key ? left : recursiveSearch(v, key, left+1);
	}
}
