package level1;

import java.util.ArrayList;
import java.util.Comparator;

public class P138477 {

	class Solution {
	    public int[] solution(int k, int[] score) {
	        
	        int[] answer = new int[score.length];
	        ArrayList<Integer> rank = new ArrayList<>();
	        
	        for(int i = 0; i < score.length; i++) {
	            
	            if(i < k) {
	                rank.add(score[i]);
	                rank.sort(Comparator.naturalOrder());
	                answer[i] = rank.get(0);
	            } else {
	                rank.add(score[i]);  
	                rank.sort(Comparator.naturalOrder());
	                rank.remove(0);
	                answer[i] = rank.get(0);
	            }   
	        }
	        
	        return answer;
	    }
	}
	
}
