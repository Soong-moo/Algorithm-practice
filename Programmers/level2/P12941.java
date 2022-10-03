package level2;

import java.util.Arrays;

public class P12941 {

	class Solution
	{
	    public int solution(int []A, int []B)
	    {
	        int answer = 0;
	        int j = A.length;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        
	        for(int i = 0; i < j; i++) {
	            answer += A[i] * B[j - 1 - i];
	        }

	        return answer;
	    }
	}
	
}
