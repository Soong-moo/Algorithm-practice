package level2;

import java.util.Stack;

public class P76502 {

	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        String str = s;
	        
	        for(int i = 0; i < str.length(); i++) {
	            if(isChecking(str)) answer++;
	            str = str.substring(1, str.length()) + str.charAt(0);
	        }
	        return answer;
	    }
	    
	    public boolean isChecking(String s) {
	        
	        Stack<Character> stack = new Stack();
	        
	         for(int i = 0; i < s.length(); i++) {
	                
	            char c = s.charAt(i);

	            if(stack.isEmpty()) stack.push(c);               
	            else if(stack.peek() == '(' && c == ')') stack.pop();
	            else if(stack.peek() == '{' && c == '}') stack.pop();
	            else if(stack.peek() == '[' && c == ']') stack.pop();
	            else stack.push(c);
	             
	        }
	        return stack.isEmpty() ? true : false;
	    }
	}
	
}
