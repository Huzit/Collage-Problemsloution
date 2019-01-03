package pratice_07;

import java.util.Arrays;
import java.util.Comparator;

public class Test_11 {

	public static void main(String[] args) {
		String v[] = { "Korea", "UK", "China", "United States", "Canada", "Brazil" };
		//Arrays.sort(v);
		Arrays.sort(v, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println(Arrays.toString(v));
	}

}
