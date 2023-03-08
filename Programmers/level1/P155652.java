package level1;

import java.util.HashSet;

public class P155652 {

	class Solution {
		
	    public String solution(String s, String skip, int index) {
	        StringBuilder answer = new StringBuilder();
	        
	        HashSet<Character> hs = new HashSet<>();
	        StringBuilder sb = new StringBuilder();
	        
	        // skip할 문자열 저장
	        for(char a : skip.toCharArray()) {
	            hs.add(a);
	        }
	        
	        // skip 문자열 제외 나머지 문자열 저장
	        for(char i = 'a'; i <= 'z'; i++) {
	            if(!hs.contains(i)) {
	                sb.append(i);    
	            }
	        }
	        
	        // skip 제외 문자열 3번 반복
	        String check = sb.toString().repeat(3);
	        
	        // skip 제외 문자열 해당 index + 추가 index의 문자열 추출
	        for(int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);
	            answer.append(check.charAt(check.indexOf(c) + index));
	        }

	        return answer.toString();
	    }
	}
	
}