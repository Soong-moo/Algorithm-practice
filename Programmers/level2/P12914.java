//https://cotak.tistory.com/51 Dynamic Programming

package level2;

public class P12914 {

	class Solution {
	    
	    public long solution(int n) {
	        
	        long[] dp = new long[2001];
	        dp[1] = 1;
	        dp[2] = 2;
	        
	        for(int i = 3; i <= n; i++) {
	            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
	        }
	        
	        return dp[n];
	    }
	}

	// ** 다 더하고 return dp[n] % 1234567을 하게 되면 overflow 발생, 먼저 나누기

	// 1 = 1 (1)
	// 2 = 11, 02 (2)
	// 3 = 111, 12, 21 (3 (1 + 2))
	// 4 = 1111, 112, 121, 211, 22 (5 (2 + 3))
	// 5 = 11111, 1112, 1121, 1211, 2111, 122, 212, 221 (8 (3 + 5))
	
}
