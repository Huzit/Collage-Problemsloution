package pratice_06;

public class Test_12 {
	public static void main(String[] args) {
		String s = "ABCDEDCBA";
		System.out.println(palindrome(s, 0));
	}

	private static boolean palindrome(String s, int i) {
		// if(i>=s.length()/2) ������ ����
		// s.charAt(i)==s.charAt(s.length()-1-i) 1������
		// palindrome(s,i+1); 2������
		// ���� �ҷ� �ߴ���
//		if (i >= s.length() / 2) {
//			if (s.charAt(i) == s.charAt(s.length() - 1 - i) && palindrome(s, i + 1))
//				return true;
//			else
//				return false;
//		}
//		else return false;
		// ������ Ǯ�� 1��
		boolean b1 = s.charAt(i) == s.charAt(s.length() - 1 - i);
//		if(b1==false) return false;
//		boolean b2=palindrome(s, i+1);
//		return b2;
		// ������ Ǯ�� 2��
		if (i >= s.length() / 2)
			return true;
		return b1 && palindrome(s, i + 1);
	}
}
