package level1;

public class P12926 {

	class Solution {
	    public String solution(String s, int n) {
	        
	        StringBuffer sb = new StringBuffer();
	        
	        for(int i = 0; i < s.length(); i++) {
	           
	            char c = s.charAt(i);

	            if(c == ' ') {
	                sb.append(c);
	                continue;
	            }
	            
	            for(int j = 0; j < n; j++) {
	                if(c == 'z') {
	                    c = 'a';
	                }
	                else if(c == 'Z') {
	                    c = 'A';
	                }
	                else {
	                    c += 1;
	                }
	            }
	            
	            sb.append((char)(c));
	        }
	        
	        return sb.toString();
	    }
	}
	
}
