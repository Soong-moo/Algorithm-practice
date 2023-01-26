//https://java119.tistory.com/106
package level2;

import java.util.HashMap;

public class P84512 {
	//1차 풀이
	class Solution {
	    public int solution(String word) {
	        
	        HashMap<String, Integer> hm = new HashMap<>();
	        final int[] RATE = {781, 156, 31, 6, 1};
	        int answer = 0;

	        hm.put("A", 0);
	        hm.put("E", 1);
	        hm.put("I", 2);
	        hm.put("O", 3);
	        hm.put("U", 4);

	        for(int i = 0; i < word.length(); i++) {
	            String a = String.valueOf(word.charAt(i));
	            answer += RATE[i] * hm.get(a) + 1;
	        }
	        
	        return answer;
	    }
	}
}

//2차 풀이
/*
class Solution {
    public int solution(String word) {

        final int[] RATE = {781, 156, 31, 6, 1};
        String str = "AEIOU";
        int answer = 0;

        for(int i = 0; i < word.length(); i++) {
            answer += RATE[i] * str.indexOf(word.charAt(i)) + 1;
        }

        return answer;
    }
}
*/