package pratice_07;

import java.util.Arrays;
import java.util.LinkedList;

public class Test_20 {

	public static void main(String[] args) {
		int n[]={432109876,423,312,34,43,21,223,42};
		radixSort(n, 10, 9); 
		// 최대 9자리까지 10진수 기수정렬

		System.out.println(Arrays.toString(n));
		}
	private static void radixSort(int[] n, int Radix, int length) {
		LinkedList<Integer>[]queue = new LinkedList[n.length];
		for(int i=0; i<queue.length; i++) queue[i]=new LinkedList<>();
		//일의 자리
		for(int i=0; i<n.length; i++) queue[(n[i]/1)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
		
		for(int i=0; i<n.length; i++) queue[(n[i]/10)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
		
		for(int i=0; i<n.length; i++) queue[(n[i]/100)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
		
		for(int i=0; i<n.length; i++) queue[(n[i]/1000)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
	
		for(int i=0; i<n.length; i++) queue[(n[i]/10000)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
		
		for(int i=0; i<n.length; i++) queue[(n[i]/100000)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
		
		for(int i=0; i<n.length; i++) queue[(n[i]/1000000)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
		
		for(int i=0; i<n.length; i++) queue[(n[i]/10000000)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
		
		for(int i=0; i<n.length; i++) queue[(n[i]/100000000)%Radix].add(n[i]);
		for(int i=0; i<queue.length; i++) while(!queue[i].isEmpty()) n[i++]=queue[i].remove();
	}
}
