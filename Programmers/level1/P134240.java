package level1;

import java.util.ArrayList;
import java.util.Iterator;

public class P134240 {

	class Solution {
	    public String solution(int[] food) {
	        String answer = "";
	        ArrayList<Integer> fi = new ArrayList<>();
	        int a = 0;
	        int cnt;
	        StringBuffer sb = new StringBuffer();
	        
	        for(int i = 1; i < food.length; i++) {
	            if(food[i] > 1) {
	                cnt = food[i] / 2;
	                while(a < cnt) {
	                    fi.add(i);
	                    a++;
	                }
	            }
	            a = 0;
	        }
	        
	        Iterator<Integer> itr = fi.iterator();
	        
	        while(itr.hasNext()) {
	           sb.append(itr.next());
	        }
	        
	        return sb.toString() + "0" + sb.reverse().toString();
	    }
	}
	
}
