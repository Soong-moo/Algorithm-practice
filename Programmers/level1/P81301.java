package level1;

public class P81301 {

	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	        
	        for(int i = 0; i < words.length; i++) {
	            s = s.replace(words[i], String.valueOf(i));
	        }
	        //String.valueOf = �Ű� ���� ���ڿ� ����ȯ
	        
	        return Integer.parseInt(s);
	    }
	}
	
}
