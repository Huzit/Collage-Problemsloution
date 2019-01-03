package pratice_04;

import java.util.Arrays;

public class Test_16 {

	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(n));
		int m[] = arrayCopy(n, n.length * 2);
		n = m;
		System.out.println(Arrays.toString(n));

		n = arrayCopy(n, (int) (n.length * 0.25));
		System.out.println(Arrays.toString(n));
	}

	private static int[] arrayCopy(int[] n, int newSize) {
		int[] m = new int[newSize];
		//m�� ���̰� ����
		if (n.length < m.length)
			for (int i = 0; i < n.length; i++)
				m[i] = n[i];
		//m�� ���̰� ª�����
		else
			for (int i = 0; i < m.length; i++)
				m[i] = n[i];
			
		return m;
	}
}
