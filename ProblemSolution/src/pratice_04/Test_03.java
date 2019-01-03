package pratice_04;

import java.util.Stack;

public class Test_03 {

	public static void main(String[] args) {
		String s = "���ѹα��� ������ �����̴�.";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}
		while (!stack.empty())
			System.out.print(stack.pop());
	}

}
