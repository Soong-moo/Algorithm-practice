package level1;

public class P12916 {

	class Solution {
	    boolean solution(String s) {
	        int i = 0;
	        int p = 0;
	        int y = 0;
	        
	        String[] t = s.toLowerCase().split("");
	        
	        for(i = 0; i < t.length; i++) {
	            System.out.println(t[i]);
	            if("p".equals(t[i])) {
	                p++;
	            }
	            else if("y".equals(t[i])) {
	                y++;
	            }
	        }
	        
	        if(p != y) {
	            return false;
	        } else {
	            return true;
	        }
	    }
	}
	
}
