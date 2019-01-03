package pratice_04;

import java.util.Stack;

public class Test_06 {
	public static void main(String[] args) {
		String s = "�λ�({Busan}[(Boo)(saan)]}��û({City}{hall}[(See)(Cheong)])"; // true
		System.out.println(checkParen(s));
	}

	private static boolean checkParen(String s) {
		Stack<Character> stack = new Stack<>();
		for (Character c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push('(');
			} else if (c == ')' || c == '}' || c == ']') {
				if(stack.empty()) return false;
				stack.pop();
			}
		}
		return stack.empty();
	}
}