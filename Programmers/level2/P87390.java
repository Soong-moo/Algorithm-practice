//https://taehoung0102.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4java-Levle2-n2%EB%B0%B0%EC%97%B4-%EC%9E%90%EB%A5%B4%EA%B8%B0

package level2;

import java.util.ArrayList;

public class P87390 {

	class Solution {
	    public int[] solution(int n, long left, long right) {
	        
	    	int[] answer = new int[(int)right - (int)left + 1];
	        ArrayList<Long> al = new ArrayList<>();

	        // (x,y) 에서 큰 값
	        for(long i = left; i <= right; i++) {
	            al.add(Math.max(i/n, i%n) + 1); // 해당 index 좌표
	        }
	        
	        for(int i = 0; i < al.size(); i++) {
	            answer[i] = al.get(i).intValue();
	        }
	        
	        return answer;
	    }
	}
}
