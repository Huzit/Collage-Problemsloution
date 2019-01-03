package pratice_06;

public class Test_14 {

	public static void main(String[] args) {
		System.out.println(gcd(64,48));
		
	}
	private static int gcd(int a, int b) {
		// 재귀 사용
		//		return b==0 ?a: gcd(b,a%b);
		//
		int c;
		while(b!=0) {
			c=a%b;
			a=b;
			b=c;
		}
		return a;
	}

}
