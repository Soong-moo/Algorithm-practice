package level2;

import java.util.ArrayList;
import java.util.Collections;

public class P42746 {

	class Solution {
	    public String solution(int[] numbers) {
	        StringBuilder answer = new StringBuilder();
	        ArrayList<String> al = new ArrayList<>();
	        
	        for(int i : numbers) {
	            al.add(String.valueOf(i));
	        }
	        
	        Collections.sort(al, (a, b) -> (b + a).compareTo(a + b));
	        
	        if(al.get(0).startsWith("0")) return "0";
	        
	        for(int i = 0; i < al.size(); i++) {
	            answer.append(al.get(i));
	        }
	        
	        return answer.toString();
	    }
	}
	
}