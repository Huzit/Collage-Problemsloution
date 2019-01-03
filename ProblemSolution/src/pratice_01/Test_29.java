package pratice_01;

import java.util.Arrays;
import java.util.Random;

public class Test_29 {
	public static void main(String[] args) {
		int K=2, N=8;
		int[] num = new int[N];
		Random random = new Random();
		
		//������ �迭 ����
		for (int i = 0; i < num.length; i++) {
			num[i]=random.nextInt(9);
		}
		
		System.out.print("�Է�(N=" + N + ") : " + Arrays.toString(num) + "\n");

		// ������ �޼ҵ�
		int temp = num[4];
		for (int j = 0; j < K; j++) {

			for (int i = 4; i > 0; i--) {
				num[i] = num[i - 1];
			}
			num[0] = temp;
			temp = num[4];
		}
		System.out.println("���(K=" + K + ") : " + Arrays.toString(num));
	}
}