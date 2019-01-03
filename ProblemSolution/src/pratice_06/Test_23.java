package pratice_06;

import java.util.Arrays;

public class Test_23 {

	public static void main(String[] args) {
		int v[] = new int[3];
		bitString(v,0);
	}
	private static void bitString(int[] v, int i) {
		int n[] = {0, 1, 2};
		
		
		/*if (i == v.length) {3
		 * 
			System.out.print(Arrays.toString(v));
			return;
		}*/
		//���� ����
		/*v[i] = 0;
		bitString(v, i + 1);
		v[i] = 1;
		bitString(v, i + 1);*/
	
	//�ǽ� #1 4��Ʈ�϶��� ����Ͻÿ�
		/*
		v[i]=0;
		bitString(v,i+1);
		v[i]=1;
		bitString(v,i+1);
		v[i]=1;
		bitString(v,i+1);*/
		
	// �ǽ�#2 3��Ʈ �������� ����ϱ� : �迭�� ���Ҹ� ���� 1�� �ʱ�ȭ�Ұ�
		/*v[i]=1;
		bitString(v,i+1);
		v[i]=0;
		bitString(v,i+1);*/
		
	//�ǽ�#3 ���ڿ��� ����ϱ�  : �迭�� ���Ҹ� ���� A�� �ʱ�ȭ�صѰ�
		/*v[i]='A';
		bitString(v,i+1);
		v[i]='B';
		bitString(v,i+1);*/
		
	//�ǽ�#4 2�ڸ� 3������ ������
		/*v[i]=0;
		bitString(v,i+1);
		v[i]=1;
		bitString(v,i+1);
		v[i]=2;
		bitString(v,i+1);*/
		
	//�ǽ�#5 2�ڸ� 8������ ��� ���
		/*for(int j=0; j<=8; j++) {
			v[i]=j;
			bitString(v, i+1);
		}*/
	//�ǽ�#6 0,1,2�� ��� �κ������� ���
	if(i==v.length) {
		for(int j=0; j<v.length; j++)
			if(v[j]!=0) System.out.print(n[j]);
		System.out.println();
		return;
	}
	v[i]=0;
	bitString(v,i+1);
	v[i]=1;
	bitString(v,i+1);
	}
	
}
