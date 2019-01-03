package pratice_01;

import java.util.Random;

public class Test_14 {
	public static void main(String[] args) {
		Random random = new Random();
		int count=0;
		
		for(int i=0; i<20; i++) {
			int dice = random.nextInt(6)+1;
			System.out.print(dice+" ");
			count++;
		}
		System.out.println("");
		System.out.println(count+"ȸ �ݺ��߽��ϴ�.");
		
		
	}
}
