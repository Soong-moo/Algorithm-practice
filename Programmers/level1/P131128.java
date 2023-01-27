//https://devmoony.tistory.com/163
package level1;

public class P131128 {

	class Solution {
	    public String solution(String X, String Y) {
	        StringBuffer answer = new StringBuffer();
	        int[] x = new int[10];
	        int[] y = new int[10];
	        
	        for(String i : X.split("")) {
	            x[Integer.parseInt(i)]++;
	        }
	        
	        for(String j : Y.split("")) {
	            y[Integer.parseInt(j)]++;
	        }
	        
	        for(int k = 9; k > -1; k--) {
	            while(x[k] > 0 && y[k] > 0) {
	                answer.append(k);
	                x[k]--;
	                y[k]--;
	            }
	        }
	        
	        if("".equals(answer.toString())) return "-1";
	        else if("0".equals(answer.toString().substring(0,1))) return "0";
	        
	        return answer.toString();
	    }
	}
	
}

//1차 풀이
/*
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String solution(String X, String Y) {
        StringBuffer answer = new StringBuffer();
        ArrayList<String> x = new ArrayList<>(Arrays.asList(X.split("")));
        ArrayList<String> y = new ArrayList<>(Arrays.asList(Y.split("")));
        
        x.sort(Comparator.reverseOrder());
        y.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < x.size(); i++) {
            for(int j = 0; j < y.size(); j++) {
                if(x.get(i).equals(y.get(j))) {
                    answer.append(x.get(i));
                    x.remove(i);
                    y.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        
        if(answer.length() == 0) return "-1";
        else if("0".equals(answer.toString().substring(0,1))) return "0";
        
        return answer.toString();
    }
}
*/
