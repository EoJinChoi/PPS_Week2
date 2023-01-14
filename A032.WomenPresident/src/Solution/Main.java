package Solution;

import java.util.Scanner;

public class Main { // 20230104

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] num = new int[15][15];
		int k, n;
		
		int T = s.nextInt();
		int[] result = new int[T];
		
		for(int i = 0; i < 15; i++) {
			num[0][i] = i;
		}
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				num[i][j] = num[i][j - 1] + num[i - 1][j];
			}
		}
		
		for(int i = 0; i < T; i++) {
			k = s.nextInt();
			n = s.nextInt();
			
			result[i] = num[k][n];
		}
		for(int i = 0; i < T; i++)
			System.out.println(result[i]);
	}

}
