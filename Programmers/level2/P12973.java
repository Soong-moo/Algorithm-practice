package level2;

import java.util.Stack;

public class P12973 {

	class Solution
	{
	    public int solution(String s)
	    {
	        Stack<Character> st = new Stack<>();
	        
	        for(int i = 0; i < s.length(); i++) {
	            
	            char c = s.charAt(i);

	            if(!st.isEmpty() && st.peek() == c) { // peek() : stack ๋งจ ์ ๋ฐํ
	                st.pop();
	            } else {
	                st.push(c);
	            }
	            
	        }
	        
	        return st.isEmpty() ? 1 : 0;
	    }
	}
	
}
