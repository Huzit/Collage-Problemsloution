package pratice_01;

import java.util.Random;

public class Test_15 {
	public static void main(String[]args) {
	
	Random random = new Random();
	int []number = new int[6]; //���� ���� Ƚ���� �����ϴ� ������
	
	for(int i=0; i<6000; i++) {
		int dice = random.nextInt(5)+1; //�ֻ����� 6000ȸ ������.
		
		switch(dice) {
		case 1: number[0]++; break;
		case 2: number[1]++; break;
		case 3: number[2]++; break;
		case 4: number[3]++; break;
		case 5: number[4]++; break;
		case 6: number[5]++; break;
		}
		
	}
	System.out.println("["+number[0]+"]"+"["+number[1]+"]"+"["+number[2]+"]"+"["+number[3]+"]"+"["+number[4]+"]"+"["+number[5]+"]");
	
	}
}
