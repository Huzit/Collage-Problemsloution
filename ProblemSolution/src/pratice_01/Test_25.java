package pratice_01;

import java.util.Arrays;
import java.util.Random;

public class Test_25 {
	public static void main(String[]args) {
		Random random = new Random();
		int N=8;
		int num[] = new int[N];
		
		for(int i=0; i<N; i++) {
			num[i]=random.nextInt(5)+1;
		}
			
		//8�ϰ��
				System.out.println(Arrays.toString(num));
				System.out.println("�� �迭�� �߰� ���� "+(num[3]+num[4])/2.);
		
		N=9;
		int temp[] = new int[N];
		for(int i=0; i<N; i++) {
			temp[i]=random.nextInt(5)+1;
		}
				
		//9�ϰ��
				System.out.println(Arrays.toString(temp));
				System.out.println("�� �迭�� �߰� ���� "+temp[4]);
	}
}