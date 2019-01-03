package pratice_06;

public class Test_26 {
	static int sum = 21;
	static int n[] = { 1, 3, 4, 5, 8, 9 };

	public static void main(String[] args) {
		int subset[] = new int[n.length];
		subsetSum(subset, 0, sum); // ���� ���޵Ǿ�� �� ���� sum���� ���
	}

	private static void subsetSum(int[] subset, int i, int partialSum) {
		if(i==n.length) {
			if(partialSum==0)
				for (int j = 0; j < subset.length; j++) {
					if(subset[j]==1) System.out.print(n[j]+" ");
				if(j==subset.length-1) System.out.println();
				}
			return;
		}
		
		subset[i]=0;
		subsetSum(subset, i+1, partialSum);
		subset[i]=1;
		subsetSum(subset, i+1, partialSum-n[i]);
	}
}