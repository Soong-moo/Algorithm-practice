package level1;

import java.util.*;

public class P12906 {

	public class Solution {
	    public int[] solution(int []arr) {
	        
	        int i = 0;
	        ArrayList<Integer> a = new ArrayList<>();
	        
	        a.add(arr[i]);
	        
	        for(i = 1; i < arr.length; i++) {
	            if(a.get(a.size() - 1) != arr[i]) {
	                a.add(arr[i]);
	            }
	        }
	        
	        int[] answer = new int[a.size()];
	        
	        for(i = 0; i < a.size(); i++) {
	            answer[i] = a.get(i);
	        }
	        
	        return answer;
	    }
	}
	
}
