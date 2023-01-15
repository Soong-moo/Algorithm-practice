package level1;

public class P12977 {

	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        boolean[] prime = new boolean[3001];
	        
	        prime[0] = prime[1] = true;
	        
	        for(int i = 2; i < Math.sqrt(prime.length); i++) {
	            if(prime[i]) continue;
	            for(int j = i * i; j < prime.length; j+= i) {
	                prime[j] = true;
	            }
	        }
	        
	        for(int a = 0; a < nums.length - 2; a++) {
	            for(int b = a + 1; b < nums.length - 1; b++) {
	                for(int c = b + 1; c < nums.length; c++) {
	                    if(!prime[nums[a] + nums[b] + nums[c]]) {
	                        answer++;
	                    }
	                }
	            }
	        }
	        
	        return answer;
	    }
	}
	
}
