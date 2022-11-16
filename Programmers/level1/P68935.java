package level1;

import java.util.ArrayList;

public class P68935 {

	class Solution {
	    public int solution(int n) {
	        
	        int answer = 0;
	        ArrayList<Integer> arr = new ArrayList<>();
	        
	        while(true) {
	            if(n < 3) {
	                arr.add(n);
	                break;
	            }
	            arr.add(n % 3);
	            n /= 3;
	        }
	        for(int i = arr.size() - 1; i >= 0; i--) {
	            answer += arr.get(arr.size() - 1 - i) * Math.pow(3,i); //pow(a,b) = a의 b제곱
	        }

	        return answer;
	    }
	}
	
}
