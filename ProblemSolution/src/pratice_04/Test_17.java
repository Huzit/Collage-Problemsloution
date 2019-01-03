package pratice_04;

public class Test_17 {

	public static void main(String[] args) {
		Test_17SimpleStack stack = new Test_17SimpleStack();

		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
//		System.out.println(stack.toString());

		for (int i = 0; i < 10; i++) {
			int data = stack.pop();
			System.out.println("Data deleted from stack:" + data);
			System.out.println(stack);
		}
	}
}
