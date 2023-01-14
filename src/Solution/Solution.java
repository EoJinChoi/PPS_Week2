package Solution;

public class Solution { // 20230106
	public static String solution(String s) {
        String answer = "";
        String[] word;
        String str = "";
        
        word = s.split(" ", -1);
        
        for(int i = 0; i < word.length; i++) {
        	if(word[i].equals(""))
        		continue;
        	
        	str = word[i].substring(1);
        	word[i] = String.valueOf(word[i].charAt(0)).toUpperCase();
        	word[i] += str.toLowerCase();
        }
        
        for(int i = 0; i < word.length; i++) {
        	if(i == word.length - 1)
        		answer += word[i];
        	else
        		answer += (word[i] + " ");
        }
//        System.out.println(answer);
        return answer;
    }
}
