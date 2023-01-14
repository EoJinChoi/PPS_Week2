package Solution;

import java.math.BigInteger;
import java.util.Scanner;

public class Main { // 20230103

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BigInteger A, B;
		BigInteger sum;
		
		A = s.nextBigInteger();
		B = s.nextBigInteger();
		s.close();
		sum = A.add(B);
		
		System.out.println(sum);
	}
}
