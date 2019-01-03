package pratice_06;

public class Test_09 {

	public static void main(String[] args) {
		int n[]= {2, 5, 1, 8, 9, 7, 3, 4};
		System.out.println(max(n,0,n.length-1));
	}
	private static int max(int[]n, int low, int high) {
		int mid=(low+high)/2;
		if(low==high)return n[low];
		int v1=max(n,low,mid);
		int v2=max(n,mid+1,high);
		//���׿����ڸ� �̿�
		return (v1>v2)?v1:v2;
//		if(low==high)return n[low];
//		
//		if(max(n,low,mid)>max(n,mid+1,high))
//			return max(n,low,mid);
//		
//		else
//			return max(n,mid+1,high);
	}

}
