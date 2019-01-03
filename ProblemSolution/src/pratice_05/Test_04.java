package pratice_05;

import java.util.LinkedList;

public class Test_04 {
	public static void main(String[] args) {
		System.out.println(solveJosephusProblem(10,3));
	}
	private static int solveJosephusProblem(int n, int k) {
		LinkedList<Integer> queue = new LinkedList<>();
		//ť�� ���� ����
		for(int i=1; i<=n; i++)
			queue.addLast(i);
		System.out.print(queue.toString());
		//������� #1
		/*while(queue.size()>=2) {
			for(int i=1; i<k; i++)
				queue.addLast(queue.removeFirst());
			System.out.println("("+queue.removeFirst()+"����)");
			System.out.print(queue.toString());
		}*/
		//������� #2
		int deleteindex=0;
	//	k=k-1; me
		while(queue.size()>1) {
			/*if(k>queue.size())  me
				k=k%queue.size();*/ 
			deleteindex=(deleteindex+k-1)%queue.size();
			System.out.println("("+queue.remove(deleteindex)+"����)");
		//	k=k+2;  me
		System.out.print(queue.toString());
		}
		return 0;
	}
}
