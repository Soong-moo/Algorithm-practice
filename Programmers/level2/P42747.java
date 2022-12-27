package level2;

import java.util.ArrayList;
import java.util.Collections;

public class P42747 {

	class Solution {
	    public int solution(int[] citations) {
	        int answer = 0;
	        ArrayList<Integer> al = new ArrayList<>();
	        
	        for(int i = 0; i < citations.length; i++) {
	            al.add(citations[i]);
	        }

	        Collections.sort(al);
	        Collections.reverse(al);

	        for(int i = 0; i < al.size(); i++) {
	            if(al.get(i) >= i + 1) {
	                answer++;
	            }
	        }
	        
	        return answer;
	    }
	}
	
}
