package pratice_06;

import java.util.Arrays;

public class Test_24 {
	static int sum=21;
	static int n[]= {1, 3, 4, 5, 8, 9};
	public static void main(String[] args) {
		int subset[]=new int [n.length];
		subsetSum(subset,0);
	}
	private static void subsetSum(int[] subset, int i) {
		if(i==n.length) {
			int result=0;
			for(int j=0; j<n.length; j++)
				if(subset[j]!=0) result+=n[j];

			if(result==sum)
				for(int j=0; j<n.length; j++) {
					if(subset[j]!=0) System.out.print(n[j]+" ");
					if(j==n.length-1) System.out.println(); 
				}
			return;
		}
		subset[i]=0;
		subsetSum(subset, i+1);
		subset[i]=1;
		subsetSum(subset, i+1);
	}

}
