package pratice_01;

import java.util.Arrays;
import java.util.Random;

public class Test_27 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] n = new int[9];
		int[] order = new int[9];
		int temp = 0;
		// �迭����
		for (int i = 0; i < 9; i++) {
			n[i] = random.nextInt(9);
		}
		// ������������ ����
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length - 1; j++) {
				if (n[j] < n[j + 1]) {
					temp = n[j + 1];
					n[j + 1] = n[j];
					n[j] = temp;
				}

			}
		}
		System.out.println("���ĵ� �迭 :"+Arrays.toString(n));

		// ���� �ű��
		order[0] = 1;
		for (int i = 0; i < n.length-1; i++) {
			if(n[i]==n[i+1]) {
				order[i+1]=order[i];
			}
			else
				order[i+1]=order[i]+1;
		}
		System.out.println("�迭�� ���� :"+Arrays.toString(order));

	}
}
