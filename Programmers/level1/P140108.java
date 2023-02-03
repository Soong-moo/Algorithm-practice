package level1;

public class P140108 {

	class Solution {
	    public int solution(String s) {
	        int answer = 1;
	        char[] alpha = s.toCharArray();
	        int a = 0, b = 0, t = 0; //a = 첫번째 문자열, b = 비교 문자열, t = 첫번째 index
	        
	        for(int i = 0; i < alpha.length - 1; i++) {
	            char x = alpha[i];
	            
	            if(a == 0) t = i;
	            
	            if(x == alpha[t]) {
	                a++;
	            } else b++;
	            
	            if(a == b) {
	                answer++;
	                a = 0;
	                b = 0;
	            }
	        }
	        
	        return answer;
	    }
	}
	
}
