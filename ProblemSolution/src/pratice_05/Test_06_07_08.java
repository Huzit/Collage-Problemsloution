package pratice_05;

//����Ž�� Breadth First Search
import java.util.LinkedList;

public class Test_06_07_08 {
	public static void main(String[] args) {
		class Point {
			int x, y;

			public Point(int x, int y) {
				this.x = x;
				this.y = y;
			}

			@Override
			public String toString() {
				return x + "," + y;
			}
		}

		int R = 6, C = 8;
		// �̷� ����
		String input = "0000000#" + "##0#0#0#" + "0000000#" + "0#####0#" + "00000###" + "###00000";

		// �̷��� ��ġ�� ������ 2�߹迭
		char maze[][] = new char[R][C];
		int m[][] = new int[R][C];
		for (int i = 0; i < input.length(); i++)
			maze[i / C][i % C] = input.charAt(i);

		// �������� ť�� ����
		LinkedList<Point> queue = new LinkedList<>();

		// �湮�ߴٰ� ǥ��
		maze[0][0] = 'v';
		m[0][0] = 1;
		queue.addLast(new Point(0, 0));

		// x, y�� ��ȭ���� ����
		int dx[] = { 0, 0, 1, -1 }, dy[] = { 1, -1, 0, 0 };

		// �̷�ã�� ť �ݺ� ����
		while (!queue.isEmpty()) {
			System.out.println(queue);
			printMaze(maze, m);
			// ť�� �����̷θ� ����
			Point p = queue.removeFirst();
			for (int i = 0; i < dx.length; i++) {
				int x = p.x + dx[i], y = p.y + dy[i];
				// ��ĭ�� ã�� (x,y�� 0����ũ��/ R,C���� �۰�/#,v�� �������� �����ض�)
				if (x < 0 || y < 0 || x >= R || y >= C || maze[x][y] == '#' || maze[x][y] == 'v')
					continue;
				maze[x][y] = 'v';
				// ������ġ�� m�迭�� 1�� ������� ���� ��ġ�� �ִ� �迭���� ���յȴ�. num++�� �ع����� ����� �������� ������ �Է��� �ȴ�.
				m[x][y] = m[p.x][p.y] + 1;
				queue.addLast(new Point(x, y));
			}
		}

		LinkedList<Point> path = new LinkedList<>();
		if (m[R - 1][C - 1] > 0)
			path.addFirst(new Point(R - 1, C - 1));
		while (path.size() > 0) {
			Point p = path.getFirst();
			if (p.x == 0 && p.y == 0)
				break;
			for (int i = 0; i < dx.length; i++) {
				int x = p.x + dx[i], y = p.y + dy[i];
				if (x < 0 || x >= R || y < 0 || y >= C)
					continue;
				if(m[p.x][p.y]-m[x][y]!=1)continue;
				path.addFirst(new Point(x, y));
				break;
			}

		}
		for(Point p: path)System.out.print("("+p.x+","+p.y+")");

	}

	private static void printMaze(char[][] maze, int[][] m) {
		// v���
//		for (int i = 0; i < maze.length; i++)
//			System.out.println(maze[i]);
//		System.out.println("-----------------------------------------");
		// ���� ���
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++)
				if (m[i][j] / 10 != 1)
					System.out.print("0" + m[i][j] + " ");
				else
					System.out.print(m[i][j] + " ");
			System.out.println("");
		}
	}

}
