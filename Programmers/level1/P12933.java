package level1;

import java.util.Arrays;

public class P12933 {
	
	class Solution {
	    public long solution(long n) {
	        
	        String[] a = String.valueOf(n).split("");
	        Arrays.sort(a);

	       StringBuffer sb = new StringBuffer();
	        for(String t : a) sb.append(t);
	       
	        return Long.parseLong(sb.reverse().toString());
	    }
	}
}
