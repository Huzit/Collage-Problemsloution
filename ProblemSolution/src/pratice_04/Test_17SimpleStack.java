package pratice_04;

import java.util.Arrays;

public class Test_17SimpleStack {
	int DefaultSize = 1;
	int MaxSize;
	int stack[];
	int top = -1;

	public Test_17SimpleStack() {
		stack = new int[DefaultSize];
		MaxSize = DefaultSize;
	}

	public void push(int data) {
		// ����á����� ũ�⸦ �ι�� �ø���.
		if (full()) {
			MaxSize *= 2;
			stack = Arrays.copyOf(stack, MaxSize);
		}
		stack[++top] = data;// ������ top�� data�� �߰��ϰ� �����͸� �̵���Ų��.
	}
	public int pop() {
		if (empty())
			throw new RuntimeException("stack empty");
		int num=stack[top];
		stack[top]=0;
		top--;
		return num;
	}
	public int peek() {
		if (empty())
			throw new RuntimeException("stack empty");
		return stack[top];
	}

	public String toString() {
		return "top=" + top + ",stack=" + Arrays.toString(stack);
	}

	private boolean full() {
		return top == MaxSize - 1;
	}

	private boolean empty() {
		return top == -1;
	}
}
