package pratice_02;

import java.util.LinkedList;

public class Test {
	public static void main(String[]args) {
		int N=100000; // �ڷ� ����
		int s[]=new int[N]; // �迭 ����
		for (int i=0; i < N; i++) s[i]=i; // �迭 �� �ڷ� ����
		
		LinkedList<Integer> list=new LinkedList<>(); // ����Ʈ ����
		for (int i=0; i < N; i++) list.add(i); // ����Ʈ �� �ڷ� ����
//		long start;
//		start=System.currentTimeMillis();
		
/*		for (int i = 0; i < N; i++){ int v=s[i]; }
		System.out.println((System.currentTimeMillis()-start)+" ms");
		start=System.currentTimeMillis();
		
		for (int i = 0; i < N; i++){ int v=list.get(i); }
		System.out.println((System.currentTimeMillis()-start)+" ms");*/
		}
	}