package pratice_01;

import java.util.Arrays;
import java.util.Random;

public class TEst {
	public static void main(String[] args) {
		long start;
		int N=10000000, M=100;
		int n[]=new int[N];
		
		Random random=new Random();
		
		for (int i = 0; i < N; i++) n[i]=random.nextInt(M);
	
		start=System.currentTimeMillis();
		
		Arrays.sort(n); // �迭 ����
		
		System.out.println("�ִ밪:"+n[n.length-1]); // �ִ밪 ���
		
		System.out.println("�ҿ�ð�:"+(System.currentTimeMillis()-start)+" ms"); // �ҿ� �ð� ���
		
		for (int i = 0; i < N; i++) n[i]=random.nextInt(M);
		
		start=System.currentTimeMillis();
		
		int max=n[0];
		
		for (int i = 1; i < n.length; i++) {
		if(n[i]>max) max=n[i];
		}
		
		System.out.println("�ִ밪:"+max); // �ִ밪 ���
		System.out.println("�ҿ�ð�:"+(System.currentTimeMillis()-start)+" ms"); // �ҿ� �ð� ���
		}
}
