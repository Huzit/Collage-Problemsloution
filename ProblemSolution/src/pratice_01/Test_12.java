package pratice_01;

public class Test_12 {

	public static void main(String[] args) {
		int n[] = {77,88,99};
		String v="";
		
		for(int i=0; i<n.length; i++) {
			//r = Integer.toString(n[i]); //������ ���ڿ��� ��ȯ -> ���� �� �ʿ� ������. �޸� ���ϸ� ���ڿ��� �Ǽ� �˾Ƽ� �ȴ�.
			
			v =v + n[i]; //���ڿ��� ��ô
			
			if(i!=n.length-1)v = v + ","; //�޸�ó��
		}
		System.out.println("["+v+"]");
	}

}
