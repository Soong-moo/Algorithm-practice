//gcd = 최대공약수, lcd = 최소공배수 (두 수의 곱 / gcd)

package level2;

import java.math.BigInteger;

public class P12953 {

	class Solution {
	    public int solution(int[] arr) {
	        
	        BigInteger answer = BigInteger.valueOf(arr[0]);
	        
	        for(int i = 0; i < arr.length - 1; i++) {
	            BigInteger bi = BigInteger.valueOf(arr[i + 1]);
	            BigInteger num = bi.gcd(answer);
	            answer = answer.multiply(bi).divide(num);
	        }
	        
	        return answer.intValue();
	    }
	}
}
