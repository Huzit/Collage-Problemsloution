package pratice_01;

public class Test_06 {
	public static void main(String[]args) {
		int n=987654321;
		int k=4;
		int p=1;
		//�������� Ǯ��1	
		System.out.println(n/(int)Math.pow(10, k-1)%10); //MathŬ������ �̿�
		
		//�������� Ǯ�� 2
		for(int i=0; i< k-1; i++) { //�ݺ����� �̿�
			p=p*10;
		}
		System.out.println((n/p)%10); 
		
		//������ Ǯ��(�ļ�)
		System.out.println(k%n);
	}
}