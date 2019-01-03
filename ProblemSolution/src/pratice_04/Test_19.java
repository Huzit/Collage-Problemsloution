package pratice_04;

import java.util.Arrays;
import java.util.Stack;

public class Test_19 {

	public static void main(String[] args) {
		int price[] = { 100, 90, 80, 70, 85, 95, 110, 120 };
		int span[] = new int[price.length];
		// ������� #1
		/*System.out.println(Arrays.toString(price));
		for (int j = 0; j < price.length; j++) {
			for (int i = 0; i <= j; i++) {
				if (price[j] >= price[i])
					span[j]++;
			}
		}*/
		// ������� #2
		Stack<Integer> stack=new Stack<>(); 
		for(int cur=0; cur<price.length; cur++) {
			while(!stack.empty()&&price[stack.peek()]<=price[cur]) stack.pop();
			//���� �ִ°� �ƴ϶� day�� �ִ´�. ������ �ʱ�ȭ ���� ������ 0�� �ִ´�.
			span[cur]=stack.empty()?cur+1:cur-stack.peek();
			stack.push(cur);
		}
		
	    System.out.println(Arrays.toString(span));
	}
}
