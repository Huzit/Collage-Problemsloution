package pratice_05;

public class Test_09 {

	public static void main(String[] args) {
		Test_09_SimpleQueue queue = new Test_09_SimpleQueue();
		System.out.println("ũ�� 1 ť �ʱ� ����: " + queue);
		queue.add('A');
		System.out.println("�ڷ� A ���� ��: " + queue);
		queue.add('B');
		System.out.println("�ڷ� B ���� ��: " + queue);
		queue.add('C');
		System.out.println("�ڷ� C ���� ��: " + queue);
		System.out.println("ť���� �ڷ� ����: " + (char) queue.remove());
		System.out.println("ť���� �ڷ� ����: " + (char) queue.remove());
		System.out.println("ť���� �ڷ� ����: " + (char) queue.remove());
		queue.add('D');
		System.out.println("�ڷ� D ���� ��: " + queue);
		queue.add('E');
		System.out.println("�ڷ� E ���� ��: " + queue);
		queue.add('F');
		System.out.println("�ڷ� F ���� ��: " + queue);
	}

}
