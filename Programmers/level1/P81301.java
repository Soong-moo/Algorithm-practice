package level1;

public class P81301 {

	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	        
	        for(int i = 0; i < words.length; i++) {
	            s = s.replace(words[i], String.valueOf(i));
	        }
	        //String.valueOf = 매개 변수 문자열 형변환
	        
	        return Integer.parseInt(s);
	    }
	}
	
}
