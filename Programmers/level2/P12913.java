//https://ilmiodiario.tistory.com/88
package level2;

public class P12913 {

	//DP 적용 풀이
	class Solution {
	    int solution(int[][] land) {

	        for(int i = 1; i < land.length; i++) {
	            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
	            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
	            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
	            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
	        }

	        return Math.max(Math.max(Math.max(land[land.length-1][0],land[land.length-1][1]),land[land.length-1][2]),land[land.length-1][3]);
	    }
	}
	
}

/*
//1차 풀이
	int solution(int[][] land) {
    	int answer = 0;
        int max = 0;
        int[] check = new int[land.length];

        for(int i = 0; i < land.length; i++) {
            for(int j = 0; j < land[i].length; j++) {
                if(i > 0 && check[i - 1] == j) continue;
                max = Math.max(max, land[i][j]);
            }
            answer += max;
            max = 0;
        }
        
        return answer;
    }

*/