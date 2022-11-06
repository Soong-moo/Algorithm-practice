package level1;

public class P77484 {
	
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        
	        int cnt = 0, zero = 0;
	        
	        for(int i = 0; i < lottos.length; i++) {
	            if(lottos[i] == 0) {
	                zero++;
	                continue;
	            }
	            for(int j = 0; j < win_nums.length; j++) {
	                if(lottos[i] == win_nums[j]) {
	                    cnt++;
	                }
	            }
	        }

	        return new int[] {rank(zero + cnt), rank(cnt)};
	    }
	    
	    public int rank(int n) {
	        switch(n) {
	            case 2 : return 5;
	            case 3 : return 4;
	            case 4 : return 3;
	            case 5 : return 2;
	            case 6 : return 1;
	            default : return 6;
	        }
	    }
	}
	
}
