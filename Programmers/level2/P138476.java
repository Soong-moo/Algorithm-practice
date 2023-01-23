//https://velog.io/@yamamamo/%EC%9E%90%EB%B0%94-HashMap-getOrDefault

package level2;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Comparator;

public class P138476 {

	class Solution {
	    public int solution(int k, int[] tangerine) {
	        int answer = 0;
	        int res = 0;
	        int t = 0;
	        
	        HashMap<Integer, Integer> hs = new HashMap<>();
	        
	        for(int i : tangerine) {
	            hs.put(i, hs.getOrDefault(i, 0) + 1);
	        }
	        
	        ArrayList<Integer> al = new ArrayList<>();
	        
	        //key 가져오기 = keySet(), value 가져오기 = values(), 둘 다 가져오기 = entrySet()
	        for(int i : hs.values()) {
	            al.add(i);
	        }
	        
	        al.sort(Comparator.reverseOrder());
	        
	        while(res < k) {
	            res += al.get(t);
	            t++;
	            answer++;
	        }
	        
	        return answer;
	    }
	}
	
}

/* 1차 풀이
	int answer = 0;
    int res = 0;
    int[] cnt = new int[10000001];
        
    for(int i : tangerine) {
    	cnt[i]++;
    }
        
    Arrays.sort(cnt);
        
    while(res < k) {
    	res += cnt[cnt.length - 1];
        answer++;
    }
        
    return answer;
*/
