package Solution;

import java.util.Scanner;

public class Main { // 20230102

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N;
		int min;
		int yFee = 0;
		int mFee = 0;
		
		N = s.nextInt();
		for(int i = 0; i < N; i++) {
			min = s.nextInt();
			int y = min / 30;
			int m = min / 60;
			
			yFee += 10 * (y + 1);
			mFee += 15 * (m + 1);
		}
		
		if(yFee == mFee) System.out.println("Y M " + yFee);
		else {
			if(yFee < mFee) System.out.println("Y " + yFee);
			else if(mFee < yFee) System.out.println("M " + mFee);
		}
	}
}
