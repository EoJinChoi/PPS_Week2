package Solution;

public class Solution { // 20230102
	public static boolean isPowerOfFour(int n) {
		boolean result;
		int cnt = 0;
		int num;
		int odd = 0;
		
        if(n < 1 || n % 4 != 0) {
        	result = false;
        	if(n == 1) result = true;
        	return result; 
        }
        
        while(n > 1) {
        	num = n % 2;
        	if(num != 0) odd++;
        	n /= 2;
        	cnt++;
        }
        
        // 2로 나눌 수 있는 횟수가 짝수이거나 그 과정의 숫자가 모두 짝수이면 4의 제곱수 
        if(cnt % 2 == 0 && odd == 0)
        	result = true;
        else result = false;
        
        System.out.println(result);
        return result;
    }
}
