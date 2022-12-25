//https://taesan94.tistory.com/142 Integer.bitCount() 사용, 정수를 2진수로 표현했을 때 1의 개수 출력 메소드

package level2;

public class P12980 {

	public class Solution {
	    public int solution(int n) {
	        int ans = 0;
	        
	        while(n > 0) {
	            if(n % 2 == 1) {
	                ans++;
	            }
	            n = n / 2;
	        }
	            
	        return ans;
	    }
	}
	
}
