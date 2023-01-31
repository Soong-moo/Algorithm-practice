package level2;

public class P12899 {

	class Solution {
	    public String solution(int n) {
	        StringBuffer answer = new StringBuffer();
	        String[] num = {"4", "1", "2"};
	        
	        int a = 0;
	        
	        while(n > 0) {
	            a = n % 3;
	            n /= 3;
	            
	            if(a == 0) n--;
	            
	            answer.append(num[a]);
	        }
	        
	        return answer.reverse().toString();
	    }
	}
	
}
