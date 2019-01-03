package pratice_06;

import java.util.Random;

public class Test_15 {
	//물웅덩이의 크기
	private static int width=0;
	public static void main(String[] args) {
		int R = 5, C = 5, count = 0;
		char ground[][] = new char[R][C];
		Random random = new Random();
		// 물웅덩이 생성
		for (int i = 0; i < ground.length; i++)
			for (int j = 0; j < ground[i].length; j++)
				ground[i][j] = (random.nextInt(3) == 0) ? '1' : '0';
		// 물웅덩이 표시
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++)
				System.out.print(ground[i][j]);
			System.out.println();
		}
		for (int i = 0; i < ground.length; i++)
			for (int j = 0; j < ground[i].length; j++)
				if (ground[i][j] == '1') {
					dfs(ground, R, C, i, j);
					count++;
					System.out.println("물웅덩이의 크기 : "+ width);
					width=0;
				}
		System.out.println("웅덩이의 갯수 : " + count);
		

	}

	private static void dfs(char[][] ground, int R, int C, int i, int j) {
		// x, y를 1씩 이동했을때 젖은위치가 있으면 재귀 || 물 웅덩이의 갯수
		for (int dy = -1; dy <= 1; dy++) 
			for (int dx = -1; dx <= 1; dx++) {
				int x=i+dx;
				int y=j+dy;
				if(x>=0 && y>=0 && x<R && y<C && ground[x][y]=='1') {
				ground[x][y]='0';
				width++;
				dfs(ground, R, C, x, y);
				}
			}
		
	}
}
