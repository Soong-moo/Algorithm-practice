package level1;

public class P82612 {

	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = -1;
	        long sum = 0;
	        int p = price;
	        for(int i = 1; i <= count; i++) {
	            sum += p * i;
	        }
	        if(money - sum < 0) {
	            answer = sum - money;
	        }
	        else return 0;
	        return answer;
	    }
	}
	
}
