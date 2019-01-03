package pratice_07;

import java.util.Arrays;

public class Test_14 {

	public static void main(String[] args) {
		int []v= {87, 95, 53, 77, 100, 95, 14};
		sort(v);
		System.out.println(Arrays.toString(v));
	}
	private static void sort(int[]v) {
		int []a= new int[101];
		int k=0;
		for(int i=0; i<v.length; i++) {
			for(int j=0; j<=a.length; j++)
				if(v[i]==j)
					a[j]++;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]!=0)
				for(int j=0; j<a[i]; j++)
					v[k++]=i;
			continue;
		}
	}

}
