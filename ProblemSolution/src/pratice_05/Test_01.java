package pratice_05;

import java.util.LinkedList;

public class Test_01 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<>();
		
		queue.addLast("�ѱ�");
		queue.addLast("�̱�");
		queue.addLast("����");
		
		System.out.println("Queue's Contents : "+queue);
		System.out.println("Queue Size : "+queue.size());
		System.out.println("Is Queue empty? : "+queue.isEmpty());
		String v=null;
		v=queue.getFirst();
		System.out.println("Identfy Queue's Fornt : "+v);
		v=queue.removeFirst();
		System.out.println("Queue's Fornt index : "+v);
		System.out.println("Queue's Contents : "+queue);
		System.out.println("Queue's Fornt index : "+queue.removeFirst());
		System.out.println("Queue's Contents : "+queue);
		System.out.println("Queue's Fornt index : "+queue.removeFirst());
		System.out.println("Queue's Contents : "+queue);
		System.out.println("is Queue empty? : "+queue.isEmpty());
	}

}
