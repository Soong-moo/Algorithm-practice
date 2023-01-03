//https://bellog.tistory.com/167?category=909112
package level2;

import java.util.HashSet;

public class P42577 {

	class Solution {
	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        HashSet<String> hs = new HashSet<>();
	        
	        for(String s : phone_book) {
	            hs.add(s);
	        }
	        
	        for(String s : phone_book) {
	            for(int i = 1; i < s.length(); i++) {
	                if(hs.contains(s.substring(0, i))) return false;
	            }
	        }
	        
	        return answer;
	    }
	}
}

/*
1차 작성 코드 13,14번 + 효율성 3,4번 실패

    Arrays.sort(phone_book);
        
    for(int i = 0; i < phone_book.length - 1; i++) {
        for(int j = i + 1; j < phone_book.length; j++) {
            if(phone_book[j].contains(phone_book[i])) return false;
        }
    }
*/


