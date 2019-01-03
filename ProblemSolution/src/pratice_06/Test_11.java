package pratice_06;

public class Test_11 {

	public static void main(String[] args) {
		String s = "South, Korea";
		char v[] = s.toCharArray();
		System.out.println(countUpper(v, 0));
	}

	private static int countUpper(char[] v, int i) {
		if (i == v.length)
			return 0;
//		int count = 0;
//		if (v[i] <= 'Z' && v[i] >= 'A')
//			count++;
//		else
//			count = count + 0;
//		return count + countUpper(v, i + 1);
		//������ Ǯ��
		return ((v[i] <= 'Z' && v[i] >= 'A')?1:0) + countUpper(v,i+1);
	}
}
