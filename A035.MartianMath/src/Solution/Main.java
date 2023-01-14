package Solution;

import java.util.Scanner;

public class Main { // 20230104

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String op;
		
		int T = s.nextInt();
		double[] result = new double[T];
		
		for(int i = 0; i < T; i++) {
			result[i] = s.nextDouble();
			op = s.nextLine();

			for(int j = 0; j < op.length(); j++) {
				if(op.charAt(j) == '@') result[i] *= 3;
				else if(op.charAt(j) == '%') result[i] += 5;
				else if(op.charAt(j) == '#') result[i] -= 7;
				else continue;
			}
		}
		
		for(int i = 0; i < T; i++)
			System.out.printf("%.2f\n", result[i]);
	}

}
