package pratice_06;

public class Test_10 {

	public static void main(String[] args) {
		String s = "South, Korea �ȳ�";
		char v[] = s.toCharArray();
		toUpper(v, 0);
		System.out.println(v);
	}

	// �ҹ��ڿ� �빮���� ���̴� 32
	private static void toUpper(char[] v, int i) {
		if (i == v.length)
			return;
		//�ҹ��� �ּ�,�ִ��� �ƽ�Ű�ڵ� ���̿� �ִ� �ƽ�Ű�ڵ尪�� v[i]�� �ƽ�Ű�ڵ尪�Ͻ� 32�� ���༭ �빮�ڷ� ��ȯ
		//int������ �ڷ��� ��ȯ�ؼ� �� �ʿ� ���� �׳� ���ڿ���ü�� ���ϸ� �ȴ�.
		if ('a' <=v[i] && v[i] <= 'z')
			v[i] = (char) (v[i] - 32);
		toUpper(v, i + 1);
	}
}
