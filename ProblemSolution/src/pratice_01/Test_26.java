package pratice_01;

import java.util.Random;

public class Test_26 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] n= new int[7];
		
		//0~9���� ������ ���Ҹ� ���� �迭 ����
		for (int i = 0; i < n.length; i++) {
			n[i] = random.nextInt(9);
		}
		//���� ���
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println("");
		
		//�ߺ��� ���� ����
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if(n[i]==n[j])
					n[j]=-1;
				}
		}
		//�۾��� ���� �迭 ���
		for (int i = 0; i < n.length; i++) {
			if(n[i]>=0) 
				System.out.print(n[i]+" ");
		}
	}

}
