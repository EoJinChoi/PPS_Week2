package Solution;

import java.util.Scanner;

public class Main { // 20230102

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N;
		int num;
		int answer = 0;
		
		N = s.nextInt();
		
		for(int i = 0; i < N; i++) {
			num = s.nextInt();
			
			if(i == (N - 1)) answer += num;
			else answer += (num - 1);
		}
		s.close();
		
		System.out.println(answer);
	}
}
