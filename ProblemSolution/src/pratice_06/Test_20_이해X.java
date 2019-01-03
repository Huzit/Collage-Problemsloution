package pratice_06;

import java.util.Arrays;

public class Test_20_이해X {

	public static void main(String[] args) {
		String s[]={};
		int[] n=new int[3];
		for (int i = 0; i < n.length; i++)
			n[i] = i;
		perm(s, n, 0);//�迭 //��ȯ�� ������ ��ġ
	}

	private static void perm(String[] s,int[] n, int i) {
		if (i == n.length) {
			for(int c=0; c<n.length; c++) {
				System.out.print(s[n[c]]);
			}
			System.out.println();
			return;
		}
		for (int j = i; j < n.length; j++) {
			int temp = n[i];
			n[i] = n[j];
			n[j] = temp; // swap
			perm(s, n, i + 1);
			temp = n[i];
			n[i] = n[j];
			n[j] = temp; // swap
		}
	}

}
