package pratice_04;

import java.util.Stack;

public class Test_11 {
	public static void main(String[] args) {
		String	e="30 10 20/*";
		System.out.println(postfixEval(e));
	}
	private static double postfixEval(String e) {
		Stack<Double>	stack=new Stack<>();
		String	s="";
		for (Character c : e.toCharArray()) {
			if("+-*/".indexOf(c)>=0) s+=" "+c+" ";
			else s+=c;
		}
		for (String token : s.split("\\s+")) {
			if(" + - * / ".contains(token)){
				double	n2=stack.pop(), n1=stack.pop();
				if(token.equals("+")) stack.push(n1+n2);
				if(token.equals("-")) stack.push(n1-n2);
				if(token.equals("*")) stack.push(n1*n2);
				if(token.equals("/")) stack.push(n1/n2);
			}
			else stack.push(Double.parseDouble(token));
		}
		return stack.pop();
	}
}
