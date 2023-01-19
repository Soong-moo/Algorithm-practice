package level1;

import java.util.Arrays;

public class P42862 {

	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = n - lost.length;
	        
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        
	        //여벌 체육복 학생 도난
	        for (int i = 0; i < lost.length; i++) {
	            for (int j = 0; j < reserve.length; j++) {
	                if (lost[i] == reserve[j]) {
	                    answer++;
	                    lost[i]  = reserve[j] = -1;
	                    break;
	                }
	            }
	        }
	        
	        // 대여
	        for (int l : lost) {
	            for (int i = 0; i < reserve.length; i++) {
	                if (reserve[i] == l + 1 || reserve[i] == l - 1) {
	                    answer++;
	                    reserve[i] = -1;
	                    break;
	                }
	            }
	        }
	        
	        return answer;
	    }
	}
	
}
