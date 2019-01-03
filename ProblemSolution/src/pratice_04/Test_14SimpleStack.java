package pratice_04;

import java.util.Arrays;

public class Test_14SimpleStack {
	int stack[];//������ �����ϴ� �迭����
	int top = -1;//top�� ���� �ʱ�ȭ
	
	//��ü ������ ���� �迭�� ũ�⸦ ����
	public Test_14SimpleStack(int size) {
		stack=new int[size];
	}
	
	//���ù迭�� �ֱ�
	public void push(int data) {
		stack[++top]=data;
	}
	
	//���ù迭���� �� �� ������
	public int pop() {
		return stack[top--];//���� ����� top�� ���� 1 ����
	}
	
	//���ÿ��� �ϳ� ����
	public int peek() {
		return stack[top];
	}
	//������ �������ִ��� Ȯ��
	public boolean isFull() {
		return top+1==stack.length;
	}
	
	//������ ������� Ȯ��
	public boolean isEmpty() {
			return top==-1;
	}
	
	//������ ��ü ������ ���
	public String toString() {
		return "top="+top+" stack="+Arrays.toString(stack);
	}
}
