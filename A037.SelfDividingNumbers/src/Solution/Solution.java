package Solution;

import java.util.*;

public class Solution { // 20230104
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
        int num;
        boolean bool = true;
        
		for(int i = left; i <= right; i++) {
			num = i;
			bool = true;
			while(num > 0) {
				if((num % 10 == 0) || i % (num % 10) != 0){
					bool = false;
					break;
				}
				num /= 10;
			}
			if(bool) list.add(i);
		}
		
//		System.out.println(list);
		return list;
    }
}
