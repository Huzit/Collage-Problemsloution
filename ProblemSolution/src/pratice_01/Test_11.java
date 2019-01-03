package pratice_01;

import java.util.Arrays;

public class Test_11 {
	public static void main(String[]args) {
		int n[];
		n =new int[3]; //n�迭�� 3ĭ�� �Ҵ�
		n[0]=77;
		n[1]=88;
		n[2]=99;
		
		/*for(int i=0; i<n.length; i++) { //���� �Ϲ����� ���
			System.out.println(n[i]);
		}
		
		for(int v:n) { //�迭 ���� �ݺ��� n�� ù���� �迭�� v�� �����ؼ� ����ϰ� �ݺ��� �������� n�� 2��° �迭�� ������ Ǯ��
			System.out.println(v);
		}
		*/
		System.out.println(Arrays.toString(n)); //�ڹ� ��ƿŬ�������� �迭�� �����ϴ� �޼ҵ带 ȣ���� ���
	}
}
