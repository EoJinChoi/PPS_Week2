package Solution;

import java.util.Scanner;

public class Main { // 20230104

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] remainder = new int[10];
		int num = 10;
		
		for(int i = 0; i < 10; i++) {
			remainder[i] = s.nextInt() % 42;
			
			for(int j = 0; j < i; j++) {
				if(remainder[i] == remainder[j]) {
					num--;
					break;
				}
			}
		}
		
		System.out.println(num);
	}

}
