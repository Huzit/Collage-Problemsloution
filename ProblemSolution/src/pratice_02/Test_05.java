package pratice_02;

import java.util.LinkedList;
import java.util.Random;

public class Test_05 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Random random = new Random();
		
		for(int i=1; i<=1000000; i++)
		list.add(random.nextInt(100));
		
		int v=list.get(99999);
		System.out.println(v);
	}

}
