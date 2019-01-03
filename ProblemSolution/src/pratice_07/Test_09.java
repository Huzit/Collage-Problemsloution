package pratice_07;

import java.util.Arrays;

public class Test_09 {

	public static void main(String[] args) {
		String v[] = { "Korea", "UK", "China", "United States", "Canada", "Brazil" };
		bubbleSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static String[] bubbleSort(String[] v) {
		String temp = null;
		for(int j=0; j<v.length; j++)
			for(int i=j+1; i<v.length; i++) {
			if(v[i-1].length()>v[i].length()) {
				temp=v[i-1];
				v[i-1]=v[i];
				v[i]=temp;
			}
			}
		return v;
		}
}
