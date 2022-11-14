package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class P68644 {

	class Solution {
	    public int[] solution(int[] numbers) {
	        
	        int a = 0;
	        HashSet<Integer> hs = new HashSet<>();
	        
	        for(int i = 0; i < numbers.length; i++) {
	            for(int j = i + 1; j < numbers.length; j++) {
	                hs.add(numbers[i] + numbers[j]);
	            }
	        }
	        
	        int[] answer = new int[hs.size()];
	        
	        Iterator itr = hs.iterator();
	        
	        while(itr.hasNext()) {
	            answer[a] = (int)itr.next();
	            a++;
	        }
	        
	        Arrays.sort(answer);
	        
	        return answer;    
	    }
	}
	
}
