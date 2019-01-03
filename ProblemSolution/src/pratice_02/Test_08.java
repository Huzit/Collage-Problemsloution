package pratice_02;

import java.util.LinkedList;

public class Test_08 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=1; i<100; i++)
			list.add(i);
		
		list.remove(2);
		System.out.println(list);
		

	}

}
