package pratice_07;

import java.util.Arrays;

public class Test_10 {
	public static void main(String[] args) {
		Player v[] = { new Player("yhkim", 4.3), new Player("cskim", 9.1), new Player("yhlee", 9.8),
				new Player("cslee", 7.3) };
		bubbleSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void bubbleSort(Player v[]) {
		Player temp;
		for(int i=0; i<v.length; i++) {
			for(int j=1; j<v.length; j++)
				if(v[j-1].record>v[j].record){
					temp=v[j-1];
					v[j-1]=v[j];
					v[j]=temp;
				}
		}
	}
}
