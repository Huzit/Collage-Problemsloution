package pratice_06;

public class Test_16_17 {

	public static void main(String[] args) {
		System.out.println(fibo(50));
	}
	private static long fibo(int n) {
		//�տ� ���� ���� �����ϴ� �迭, n������ �����ϱ� ���� n+1�� �־���. topdown dynamic programing ��
		long[] memo  = new long[n+1];
		return fiboMemo(n,memo);
	}
	private static long fiboMemo(int n, long[]memo) {
		if(memo[n]>0) return memo[n];
		if(n<2) memo[n]=n;
		else memo[n]=fiboMemo(n-2,memo)+fiboMemo(n-1,memo);
		return memo[n];
	}

}
