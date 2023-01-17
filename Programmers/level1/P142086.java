package level1;

public class P142086 {

	class Solution {
	    public int[] solution(String s) {
	        int[] answer = new int[s.length()];
	        
	        answer[0] = -1;
	        
	        for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            for(int j = i - 1; j >= 0; j--) {
	                char d = s.charAt(j);
	                if(c == d) {
	                    answer[i] = i - j;
	                    break;
	                } else {
	                    answer[i] = -1;
	                }
	            }
	        }

	        return answer;
	    }
	}
	
}
