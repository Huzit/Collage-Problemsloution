package pratice_04;

public class Test_14 {

	public static void main(String[] args) {
		Test_14SimpleStack stack=new Test_14SimpleStack(10);
		
		stack.push(5);
		stack.push(9);
		stack.push(1);
		stack.push(4);
		stack.push(6);
		stack.push(7);
		stack.push(2);
		stack.push(7);
		stack.push(0);
		stack.push(3);
		
		
		System.out.println("Last Saved Stack: "+stack.peek());
		System.out.println("Stack is Full: "+stack.isFull());
		System.out.println("Stack is Empty: "+stack.isEmpty());
		
//		int data=stack.pop();
//		System.out.println("Data deleted form stack : "+data);
		
		System.out.print(stack.toString());

	}

}
