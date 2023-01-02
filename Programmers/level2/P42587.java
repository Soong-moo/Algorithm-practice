//https://bada744.tistory.com/102
//https://fbtmdwhd33.tistory.com/223
//https://velog.io/@gillog/Java-Priority-Queue%EC%9A%B0%EC%84%A0-%EC%88%9C%EC%9C%84-%ED%81%90
package level2;

import java.util.PriorityQueue;
import java.util.Collections;

public class P42587 {

	class Solution {
	    public int solution(int[] priorities, int location) {
	    	
	        int answer = 1;
	        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
	        
	        for(int i = 0; i < priorities.length; i++) {
	            queue.add(priorities[i]);
	        }
	        
	        while(!queue.isEmpty()) {
	            for(int i = 0; i < priorities.length; i++) {
	                if(queue.peek() == priorities[i]) {
	                    if(i == location) {
	                        return answer;
	                    }
	                    answer++;
	                    queue.poll();
	                }
	            }
	        }
	        
	        return answer;
	    }
	}
	
}
