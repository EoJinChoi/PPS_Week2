package Solution;

public class Solution { // 20230102
	public static boolean lemonadeChange(int[] bills) {
		int five = 0;
		int ten = 0;
		boolean result = true;
		
		for(int i = 0; i < bills.length; i++) {
			if(bills[i] == 5) {
				five++;
			}
			else if(bills[i] == 10) {
				if(five > 0) five--;
				else {
					result = false;
					break;
				}
				ten++;
			}
			else if(bills[i] == 20) {
				if(ten > 0 && five > 0) {
					five--;
					ten--;
				}
				else if(five >= 3) five -= 3;
				else {
					result = false;
					break;
				}
			}
		}
		System.out.println(result);
		return result;
    }
}
