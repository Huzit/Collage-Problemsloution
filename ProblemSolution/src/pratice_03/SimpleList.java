package pratice_03;

public class SimpleList {
	Node head;
	Node tail;
	int size; // size��� �ν��Ͻ����� ����

	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		if (size == 0)
			tail = head;
		size++; // ��带 �߰��Ҷ� ������ ����
	}
	
	//���߿��Ḯ��Ʈ ������ �߰�
	public void addLast(int data) {
		Node newNode = new Node(data);
		newNode.prev=tail;
		tail.next=newNode;
		tail=newNode;
		size++;
	}

	// ù��°�� �����ϴ� �޼ҵ�
	public void removeFirst() {
		if (head != null) {
			head = head.next;
			size--; // ��带 �����Ҷ� ����
		}
	}

	public int size() {
		return size; // ������ ��ȯ
	}

	// link�� ���Ҹ� ��ȯ�ϴ� �޼ҵ�
	public int get(int i) {
		if (i < 0 || i > size)
			throw new RuntimeException("��������");// ���࿡�� ��Ÿ���� �����ϰ�� "��������"��� �޼����� ����ϱ�
		Node p = head;
		while (i > 0) {
			p = p.next;
			i--;
		}
		return p.data;
	}

	// tail�ʵ带 ������� ���� ���

	/*public void addLast(int data) {
		if (head == null)
			head = new Node(data);
		else {
			Node lastNode = new Node(data);
			Node p = head;
			for (int i = 0; i < size - 1; i++) {
				p = p.next;
			}
			p.next = lastNode;
		}
	}*/

	// tail�ʵ带 ����� ���
	/*public void addLast(int data) {
		if (head == null) {
			head = tail = new Node(data);
			size--;
		} else {
			tail.next = new Node(data);
			tail = tail.next;
			size--;
		}
	}*/

	// ������ ��ũ�� �����ϴ� �޼ҵ�
	/*public void removeLast() {
		Node p = head;
		for (int i = 0; i < size; i++) {
			if (p == tail)
				break;
			p = p.next;
		}
		p.next = null;
		size--;
	}*/
	//removeLast�� ���� : addLast�ʹ� �ٸ��� ������ �ϱ� ���ؼ� head���� ���ʴ�� Ž���ؼ� �;��ϱ⶧���� �ð��� �����ɸ���.
	//���߿��Ḯ��Ʈ�� ������ �������� �����ϴ� �޼ҵ�
	public void removeLast() {
		if(tail!=null)
			tail=tail.prev;
		tail.next=null;
	}

	@Override
	public String toString() {
		String v = "";
		for (Node p = head; p != null; p = p.next) {
			if (v.length() > 0)
				v += "->";
			v += p.data;
		}
		return v;
	}
}