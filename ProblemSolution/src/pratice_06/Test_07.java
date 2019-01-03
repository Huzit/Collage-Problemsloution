package pratice_06;

public class Test_07 {

	public static void main(String[] args) {
		int n[]= {1, 2, 3, 4, 5};
		System.out.println(sum(n,0));
	}
	//i=0 sum(n,i) = n[0]
	//i<n.length	sum(n,i) = n[i]+sum(n,i+1)
	private static int sum(int[]n, int i) {
		if(i==n.length-1) return n[n.length-1];
		return n[i]+sum(n,i+1);
	}
}
