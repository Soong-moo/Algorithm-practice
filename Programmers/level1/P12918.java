package level1;

public class P12918 {

	class Solution {
	    public boolean solution(String s) {

	        char tmp;
	        if(s.length() == 4 || s.length() == 6) {
	            for(int i = 0; i < s.length(); i++) {
	                tmp = s.charAt(i);
	                if(Character.isDigit(tmp) == false) {
	                    return false;
	                }
	            }
	        }
	        else return false;
	        
	        return true;
	    }
	}
	
}
