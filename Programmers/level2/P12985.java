package level2;

public class P12985 {

	class Solution
	{
	    public int solution(int n, int a, int b)
	    {
	        int answer = 0;

	        while(true) {
	                     
	            if((a % 2 == 1 && b == a + 1) || b % 2 == 1 && a == b + 1) {
	                return answer + 1;    
	            }
	            
	            answer++;
	            
	            if(a % 2 == 0) {
	                a = a / 2;
	            } else {
	                a = a / 2 + 1;
	            }
	            
	            if(b % 2 == 0) {
	                b = b / 2;
	            } else {
	                b = b / 2 + 1;
	            }
	        }
	    }
	}
	
}
