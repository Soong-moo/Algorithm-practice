package level2;

import java.util.Arrays;

public class P42885 {

	class Solution {
		
	    public int solution(int[] people, int limit) {
	        int answer = 0;
	        int i = 0;
	        
	        Arrays.sort(people);
	        
	        for(int j = people.length - 1; j >= i; j--) {
	            
	            if(people[i] + people[j] > limit) {
	                answer++; // 제일 무거운 사람 혼자
	            }
	            else { // 제일 가벼운 사람 + 제일 무거운 사람 보냄
	                answer++;
	                i++;
	            }
	        }
	        
	        return answer;
	    }
	}
}
