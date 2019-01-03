package pratice_08;

import java.util.Random;

public class Test_01 {

	public static void main(String[] args) {
		int v[]=new int[1000000];
		Random random=new Random();
		for (int i = 0; i < v.length; i++) v[i]=random.nextInt(1000000);
		int key=1234;
		System.out.println(search(v, key));
	}
	private static int search(int[] v, int key) {
		//실습1
		/*for(int i=0; i<v.length; i++) {
			if(v[i]==key)
				return v[i];
		}
		return -1;*/
		//실습2
		if(v[v.length-1]==key) return v.length-1;
		
		v[v.length-1]=key;
		int i=0;
		while(v[i]!=key) i++;
		if(i==v.length-1) return 1;
		return i;
	}

}
