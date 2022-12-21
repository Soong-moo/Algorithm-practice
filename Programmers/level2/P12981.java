package level2;

import java.util.ArrayList;

public class P12981 {
	
	//HashMap, HashSet으로도 가능하기 때문에 찾아볼 것.
	
	class Solution {
		
	    public int[] solution(int n, String[] words) {
	    	
	        int[] answer = {};
	        ArrayList<String> a = new ArrayList<>();

	        for(int i = 0; i < words.length - 1; i++) {
	            char x = words[i].charAt(words[i].length() - 1);
	            char y = words[i + 1].charAt(0);
	            
	            if(x != y) {
	                return new int[] {(i + 1) % n + 1, (i + 1) / n + 1};
	            }
	            
	            if(a.contains(words[i + 1])) {
	                return new int[] {(i + 1) % n + 1, (i + 1) / n + 1};
	            }
	                        
	            a.add(words[i]);
	        }
	        
	        System.out.println(a);
	        
	        return new int[] {0, 0}; // { % n + 1, / n + 1}
	    }
	}
}