package level2;

public class P12924 {

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        int cnt = 0;
	        
	        for(int i = 1; i <= n; i++) {
	            answer = 0;
	            
	            for(int j = i; j <= n; j++) {
	                
	                answer += j;
	                if(answer == n) {
	                    cnt++;
	                    break;
	                }
	                if(answer > n) {
	                    break;
	                }
	            }
	        }
	        return cnt;
	    }
	}
	
}
