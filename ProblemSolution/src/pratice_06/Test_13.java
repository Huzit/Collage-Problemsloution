package pratice_06;

import java.util.Arrays;

public class Test_13 {

	public static void main(String[] args) {
		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		reverse(n, 0);
		System.out.println(Arrays.toString(n));
	}

	private static void reverse(int[]n, int i) {
		//i��° ���� �����Ǵ� �ݴ��� ��(n.length-1-i)�� ��ȯ
		if(i==n.length/2) return;
		int temp= n[i];
		n[i]=n[n.length-1-i];
		n[n.length-1-i]=temp;
		reverse(n,i+1);
	}

}