package pratice_06;

public class Test_22 {

	public static void main(String[] args) {
		int G=1000000000;//�ʾ�
		long step=fact(20);
		System.out.println(step);
		System.out.println(step/G+"��");
		System.out.println(step/G/60+"��");
		System.out.println(step/G/60/60+"��");
		System.out.println(step/G/60/60/24+"��");
		System.out.println(step/G/60/60/24/365+"��");
	}
	private static long fact(int n) {
		return n==0 ? 1 : fact(n-1)*n;
	}

}
