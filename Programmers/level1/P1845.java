package level1;

import java.util.HashSet;

public class P1845 {

	class Solution {
	    public int solution(int[] nums) {
	        HashSet<Integer> hs = new HashSet<>();
	        
	        for(int num : nums) {
	            hs.add(num);
	        }
	        
	        if(nums.length / 2 <= hs.size()) {
	            return nums.length / 2;
	        }
	        
	        else {
	            return hs.size();
	        }
	        
	    }
	}
	
}
