package level1;

public class P132267 {

	class Solution {
	    public int solution(int a, int b, int n) {
	        int answer = 0;
	        while(n >= a) {
	            answer += n / a * b;
	            n = n % a + b * (n / a); //n - (n / a) * a = n % a
	        }
	        return answer;
	    }
	}
	
}
