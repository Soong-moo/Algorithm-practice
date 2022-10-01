package level1;

import java.lang.Math;

public class P12934 {

	class Solution {
	    public long solution(long n) {
	        long result = (long)Math.sqrt(n);
	    if((long)Math.pow(result, 2) == n) {
	        return (long)Math.pow(result+1, 2);
	    }    
	    else {
	        return -1;
	    }
	    }
	}
	
}
