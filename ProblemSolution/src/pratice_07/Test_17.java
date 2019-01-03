package pratice_07;

import java.util.Arrays;

public class Test_17 {
	public static void main(String[] args) {
		String v[] = { "Korea", "UK", "China", "United States", "Canada", "Brazil" };
		countingSort(v, 20);
		// 최대값 10
		System.out.println(Arrays.toString(v));
	}

	private static void countingSort(String[] n, int max) {
		String m[] = new String[n.length];
		int count[] = new int[max + 1];
		
		for (int i = 0; i < n.length; i++)
			count[n[i].length()]++;
		for (int i = 1; i < count.length; i++)
			count[i] += count[i - 1];
		for (int i = n.length - 1; i >= 0; i--)
			m[--count[n[i].length()]] = n[i];
		for (int i = 0; i < m.length; i++)
			n[i] = m[i];
	}

}
