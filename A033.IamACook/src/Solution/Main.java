package Solution;

import java.util.Scanner;

public class Main { // 20230104

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		int idx = 0;
		
		for(int i = 0; i < 5; i++) {
			sum = 0;
			for(int j = 0; j < 4; j++) {
				sum += s.nextInt();
			}
			if(sum > max) {
				max = sum;
				idx = i + 1;
			}
		}
		
		System.out.println(idx + " " + max);
	}
}
