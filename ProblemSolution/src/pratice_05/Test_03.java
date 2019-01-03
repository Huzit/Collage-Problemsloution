package pratice_05;

import java.util.LinkedList;

public class Test_03 {

	public static void main(String[] args) {
		int n=7, k=4;
		LinkedList<Integer> queue = new LinkedList<>();
		for(int i=1; i<=n; i++) queue.add(i);
		int curPos=0;
		System.out.println(queue.get(curPos+k-1));
		curPos=5;
		//������ �ڵ忡�� �����÷ο찡 �Ǿ�� �ϱ� ������ ��ⷯ �����ڸ� �Ἥ curPos�� ���� �����÷ο� ��Ų��.
		System.out.println(queue.get((curPos+k-1)%7));
	}

}
