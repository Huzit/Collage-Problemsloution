package pratice_09;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test_04 {
	public static void main(String[] args) {
		Test_04_Player[] player = new Test_04_Player[10];
		TreeMap<Test_04_Player, Integer> map = new TreeMap<>();
		TreeSet<Integer> set = new TreeSet<>();
		
		
		for(int i=0; i<player.length; i++) {
			player[i]=new Test_04_Player(i+1);
			map.put(player[i], player[i].id);
		}
		for(int i=0; i<player.length; i++) {
			if(i%2==0)
				map.remove(player[i].id);
		}
		System.out.println(map);
	}//맞긴 맞는데 안돌아감(내생각)
}
