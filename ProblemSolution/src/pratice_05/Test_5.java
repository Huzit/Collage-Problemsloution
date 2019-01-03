package pratice_05;

public class Test_5 {
	public static void main(String[] args) {
		int R = 5, C = 6;
		String s = "012345678901234567890123456789";
		char maze[][] = new char[R][C];
		int sig=0;
		for (int i = 0; i < R; i++)
			for (int j = 0; j < C; j++) {
					maze[i][j]=s.charAt(sig);
					sig++;
			}
		
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++)
				System.out.print(maze[i][j]);
			System.out.println();
		}
	}
}
