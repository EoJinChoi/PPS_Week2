package Solution;

public class Solution { // 20230105
	public static boolean halvesAreAlike(String s) {
        String left, right;
        boolean answer;
        left = s.substring(0, (s.length() / 2));
        right = s.substring(s.length() / 2);
        int l = 0;
        int r = 0;
        
        left = left.toLowerCase();
        right = right.toLowerCase();
        
        for(int i = 0; i < s.length() / 2; i++) {
        	if(left.charAt(i) == 'a' || left.charAt(i) == 'e' || left.charAt(i) == 'i' || left.charAt(i) == 'o' || left.charAt(i) == 'u') 
        		l++;
        	if(right.charAt(i) == 'a' || right.charAt(i) == 'e' || right.charAt(i) == 'i' || right.charAt(i) == 'o' || right.charAt(i) == 'u') 
        		r++;
        }
        if(l == r) answer = true;
        else answer = false;
        
//        System.out.println(answer);
        return answer;
    }
}
