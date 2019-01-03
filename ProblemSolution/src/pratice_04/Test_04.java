package pratice_04;

import java.util.LinkedList;

public class Test_04 {

	public static void main(String[] args) {
		String s = "���ѹα��� ������ �����̴�.";
		LinkedList<Character> stack = new LinkedList<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			stack.addFirst(c);
		}
		
		while(stack.isEmpty()==false) {
			System.out.print(stack.pop());
		}

	}

}
