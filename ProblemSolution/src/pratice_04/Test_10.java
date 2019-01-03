package pratice_04;

import java.util.Stack;

public class Test_10 {
	public static void main(String[] args) {
		String e = "3 1 2 / *";
		System.out.println(postfixEval(e));
	}

	private static double postfixEval(String e) {
		Stack<Double> stack = new Stack<>();
		for (String token : e.split("\\s+")) {
			if ("+-/*".contains(token)) {
				double n2 = stack.pop();
				double n1 = stack.pop();
				//��Ģ���꺰�� ���
				if (token.equals("+"))
					stack.push(n1 + n2);
				if (token.equals("-"))
					stack.push(n1 - n2);
				if (token.equals("*"))
					stack.push(n1 * n2);
				if (token.equals("/"))
					stack.push(n1 / n2);
				continue;
			} else {
				stack.push(Double.valueOf(token));
			}
			
		}
		return stack.pop();
	}
}