package level1;

public class P12950 {

	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = arr1;
	        int i = 0, j = 0;
	        for(i = 0; i < arr1.length; i++) {
	            for(j = 0; j < arr1[i].length; j++) {
	                answer[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }
	        return answer;
	    }
	}
	
}
