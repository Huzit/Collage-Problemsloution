package pratice_04;

public class Test_13 {

	public static void main(String[] args) {
		String s="���ѹα��� ������ �����̴�.";
		char stack[]=new char[s.length()];
		int top = -1;
		for (int i = 0; i < s.length(); i++) {
			stack[++top]=s.charAt(i);
		}
		while(top>=0) {
			System.out.print(stack[top]);
			top--;
		}
	}

}
