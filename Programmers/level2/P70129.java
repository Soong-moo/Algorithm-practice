package level2;

public class P70129 {
	// /https://parkjye.tistory.com/81

	class Solution {
	    public int[] solution(String s) {
	        
	        int cnt = 0; //1�� �� ������ ��ȯ Ƚ��
	        int zero = 0; //������ 0�� ����

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
