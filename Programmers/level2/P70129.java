package level2;

public class P70129 {
	// /https://parkjye.tistory.com/81

	class Solution {
	    public int[] solution(String s) {
	        
	        int cnt = 0; //1이 될 때까지 변환 횟수
	        int zero = 0; //제거한 0의 개수

	        while(s.length() > 1) {
	        
	            int one = 0;
	            
	            for(int i = 0; i < s.length(); i++) {
	                if(s.charAt(i) == '0') zero++;
	                else one++;
	            
	            }
	            s = Integer.toBinaryString(one);
	            cnt++;
	        }
	        
	        int[] answer = {cnt,zero};
	        
	        return answer;
	    }
	}
	
}
