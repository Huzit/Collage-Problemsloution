package pratice_01;

import java.util.Random;

public class Test_20 {

	public static void main(String[] args) {
		int N = 10, M = 99;
		int n[] = new int[N];
		long start=System.currentTimeMillis();
		double result=0;
		
		Random random = new Random();
		
		for (int i = 0; i < N; i++)n[i] = random.nextInt(M);
		
		for	(int i=0; i<N; i++) result+=n[i];
		
		System.out.printf("%.2f"+"\n", result/N);
		System.out.println("�ҿ�ð�:"+(System.currentTimeMillis()-start)+" ms");
		
	}

}
