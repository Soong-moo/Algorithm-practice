//https://devmoony.tistory.com/169
package level1;

public class P136798 {

		class Solution {
		    public int solution(int number, int limit, int power) {
		        int answer = 0;
		        int a = 0;
		        int[] cnt = new int[number];
		        
		        for(int i = 1; i <= number; i++) {
		            for(int j = 1; j * j <= i; j++) {
		                if(j * j == i) {
		                    cnt[a]++;
		                }
		                else if(i % j == 0) cnt[a] += 2;
		            }
		            if(cnt[a] > limit) cnt[a] = power;
		            a++;
		        }
		        
		        for(int i = 0; i < cnt.length; i++) {
		            answer += cnt[i];
		        }
		        
		        return answer;
		    }
		}
		
}
