//굳이 ArrayList에 써도 됐는가, 변수 선언으로 받아서 비교해도 됨
package level1;

import java.util.ArrayList;
	
public class P147355 {

	class Solution {
	    public int solution(String t, String p) {
	        int answer = 0;
	        ArrayList<Long> al = new ArrayList<>();
	        Long a = Long.parseLong(p);
	        
	        for(int i = 0; i <= t.length() - p.length(); i++) {
	            al.add(Long.parseLong(t.substring(i, i + p.length())));
	            if(al.get(i) <= a) {
	                answer++;
	            }
	        }
	        
	        return answer;
	    }
	}
}