package Solution;

public class Solution { // 20230103
	public static boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int num = x;
		
		while(x > 0) {
			sum += (x % 10);
			x /= 10;
		}
		if(num % sum != 0) answer = false;
		
//		System.out.println(answer);
		return answer;
	}
}
