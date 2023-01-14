package Solution;

public class Solution { // 20230105
	public static int mySqrt(int x) {
		long i = 1;
		
		while(true) {
			if(i * i > x)
				break;
			i++;
		}
		
//		System.out.println(i - 1);
		return(int)(i - 1);
	}
}
