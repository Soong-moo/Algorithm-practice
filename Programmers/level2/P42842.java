package level2;

public class P42842 {
	
	class Solution {
	    public int[] solution(int brown, int yellow) {
	        
	        int yellowHeight = 1;
	        int col = 0;
	        int row = 0;
	        int bb = 0;
	        int yb = 0;
	        
	        while(true) {
	        col = (yellow / yellowHeight) + 2;
	        row = yellowHeight + 2;
	        bb = (col * 2) + (row * 2) - 4;
	        yb = (col * row) - bb;
	            
	        if(bb == brown && yb == yellow) break;
	        yellowHeight++;
	        }
	        
	        return new int[]{col, row};
	    }
	}
	
}
