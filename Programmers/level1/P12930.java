package level1;

public class P12930 {
	
	class Solution {
	    public String solution(String s) {
	        String[] str = s.split("");
	        
	        int cnt = 0;
	        
	        for(int i = 0; i < str.length; i++) {
	            if(str[i].equals(" ")) {
	                cnt = 0;
	                str[i] = " ";
	            }
	            else {
	                if(cnt % 2 == 0) {
	                    str[i] = str[i].toUpperCase();
	            } 
	                else {
	                    str[i] = str[i].toLowerCase();
	                }
	            cnt++;
	            }
	        }
	        return String.join("", str);
	    }
	}
	
}
