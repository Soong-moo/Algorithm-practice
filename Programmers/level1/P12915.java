package level1;

import java.util.ArrayList;
import java.util.Comparator;

public class P12915 {

		class Solution {
	    public String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length];
	        ArrayList<String> al = new ArrayList<>();
	        
	        for(int i = 0; i < strings.length; i++) {
	            al.add(strings[i].charAt(n) + strings[i]);
	        }
	        
	        al.sort(Comparator.naturalOrder());
	        
	        for(int i = 0; i < al.size(); i++) {
	            answer[i] = al.get(i).substring(1, al.get(i).length());
	        }
	        
	        return answer;
	    }
	}
	
}
