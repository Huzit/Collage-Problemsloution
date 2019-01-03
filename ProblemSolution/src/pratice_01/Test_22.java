package pratice_01;

import java.util.Arrays;
import java.util.Random;

public class Test_22 {

	public static void main(String[] args) {
		Random random = new Random();
		int N = 9, first, second;
		int[] num = new int[N];
		int[] ranking = new int[N];

		// �������� �迭 ����
		for (int i = 0; i < N; i++)
			num[i] = random.nextInt(9);

		// ù��°�� ū ���� �����ϴ� ����
		first = num[0];

		for (int i = 0; i < N; i++)
			if (num[i] > first)
				first = num[i];

		// �ι����� ū ���� �����ϴ� ����
		if (first == num[0])
			second = num[1];
		else
			second = num[0];

		for (int i = 0; i < N; i++) {
			if (num[i] == first)
				continue;
			if (num[i] > second)
				second = num[i];
		}
		
		// ���� �ű��
		for(int i=0; i<N; i++) {
			if(first==num[i])
				ranking[i]=1;
			else if(second==num[i])
				ranking[i]=2;
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(ranking));
		System.out.println("First Big Number : "+first);
		System.out.println("Second Big Number : "+second);
	}

}
