package level1;

import java.util.ArrayList;
import java.util.Comparator;

public class P42748 {

	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        ArrayList<Integer> arr;
	        
	        for (int i = 0; i < commands.length; i++) {
	            arr = new ArrayList<>();
	            for(int j = commands[i][0]; j <= commands[i][1]; j++) {
	                arr.add(array[j - 1]);
	            }
	            arr.sort(Comparator.naturalOrder());
	            answer[i] = arr.get(commands[i][2] - 1);
	        }
	            
	                
	        
	        return answer;
	    }
	}
	
}
