package pratice_06;

public class Test_18 {

	public static void main(String[] args) {
		System.out.println(fibo(50));
	}
	private static long fibo(int n) {
		long[] fibo = new long[n];
		fibo[0]=0;
		fibo[1]=1;
		if(n>0) {
			for(int i=2; i<n; i++) {
				fibo[i]=fibo[i-2]+fibo[i-1];
			}
		}
		return fibo[n-1];
	}

}
