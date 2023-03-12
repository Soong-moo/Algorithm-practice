//https://velog.io/@ujone/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%92%A4%EC%97%90-%EC%9E%88%EB%8A%94-%ED%81%B0-%EC%88%98-%EC%B0%BE%EA%B8%B0-JAVA
package level2;

import java.util.Stack;

public class P154539 {

	class Solution {
	    public int[] solution(int[] numbers) {
	        Stack<Integer> stack = new Stack<>();
	        int[] answer = new int[numbers.length];
	        
	        for(int i = 0; i < numbers.length; i++) {
	            
	            if(stack.isEmpty() || numbers[i] < numbers[i - 1]) {
	                stack.push(i);
	            } else {
	                while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
	                    answer[stack.pop()] = numbers[i];
	                }
	                stack.push(i);
	            }
	        }
	        
	        while(!stack.isEmpty()) {
	            answer[stack.pop()] = -1;
	        }
	        
	        return answer;
	    }
	}
	
}
