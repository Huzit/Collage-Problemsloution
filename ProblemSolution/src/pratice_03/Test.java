package pratice_03;

public class Test {
	public static void main(String[] args) {
		SimpleList list = new SimpleList();

		/*for (int i = 0; i < 5; i++)
			list.addFirst(i);
		
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

		list.addFirst(9);
		list.addLast(7);
		System.out.println("\n"+list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);*/
		
		list.addFirst(1);
		list.addFirst(2);
		list.addLast(9);
		list.addLast(8);
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}

}
