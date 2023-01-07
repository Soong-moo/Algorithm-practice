//https://velog.io/@ds02168/9-1-%EB%8D%94-%EB%A7%B5%EA%B2%8C
package level2;

import java.util.PriorityQueue;

public class P42626 {

	class Solution {
	    public int solution(int[] scoville, int K) {
	        int answer = 0;
	        PriorityQueue<Integer> queue = new PriorityQueue<>();
	        
	        for(int i : scoville) {
	            queue.add(i);
	        }
	        
	        while(queue.size() >= 2 && queue.peek() < K) {
	            
	            int a = queue.poll();
	            int b = queue.poll();
	            
	            queue.add(a + (b * 2));
	            answer++;
	        }
	        
	        if(queue.peek() < K) return -1;

	        return answer;
	    }
	}
	
}
