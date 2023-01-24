package level2;

import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class P64065 {
	
		class Solution {
	    public int[] solution(String s) {

	        StringTokenizer st = new StringTokenizer(s, "{,}");
	        HashMap<String, Integer> hs = new HashMap<>();

	        while(st.hasMoreTokens()) {
	            String a = st.nextToken();
	            hs.put(a, hs.getOrDefault(a, 0) + 1);
	        }
	        
	        ArrayList<String> al = new ArrayList<>(hs.keySet());
	        
	        Collections.sort(al, (a, b) -> (hs.get(b).compareTo(hs.get(a))));
	        
	        int[] answer = new int[al.size()];
	        
	        for(int i = 0; i < al.size(); i++) {
	            answer[i] = Integer.parseInt(al.get(i));
	        }
	        
	        return answer;
	    }
	}
}