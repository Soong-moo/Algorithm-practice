package level2;

import java.util.Stack;
import java.util.ArrayList;

public class P42586 {

	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	        
	        ArrayList<Integer> al = new ArrayList<>();
	        Stack<Integer> stack = new Stack<>();
	        int cnt = 0;
	        int check = 0;
	        int k = 0;

	        for(int i = progresses.length - 1; i >= 0; i--) {
	            while(progresses[i] < 100) {
	                progresses[i] += speeds[i];
	                cnt++;
	            }
	            stack.push(cnt);
	            cnt = 0;
	        }
	        
	        while(!stack.isEmpty()) {
	            
	            check = stack.pop();
	            cnt++;
	            
	            while(!stack.isEmpty()) {
	                if(stack.peek() <= check) {
	                    cnt++;
	                    stack.pop();
	                } else {
	                    break;
	                }
	            }
	            al.add(k, cnt);
	            cnt = 0;
	            k++;
	        }
	        
	        int[] answer = new int[al.size()];
	        
	        for(int i = 0; i < al.size(); i++) {
	            answer[i] = al.get(i).intValue();
	        }
	        return answer;
	    }
	}
}
