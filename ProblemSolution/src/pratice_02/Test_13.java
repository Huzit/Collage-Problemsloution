package pratice_02;

import java.util.Arrays;


public class Test_13 {
	public static void main(String[] args) {
		char s[] = { };
		
		System.out.println(Arrays.toString(s)); // ���� ��
		
		char t[] = new char[s.length + 1];
		
//		System.arraycopy(s, 0, t, 1, s.length);
		for (int i = 0; i < t.length-1; i++) {
			t[i+1]=s[i];
		}
		
		t[0] = 0;
		s = t;
		
		System.out.println(Arrays.toString(s)); // ���� ��
	}
}
