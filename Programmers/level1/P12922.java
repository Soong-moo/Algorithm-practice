package level1;

public class P12922 {

	class Solution {
	    public String solution(int n) {
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0; i < n; i++) {
	            if(i % 2 == 0) {
	                sb.append("��");
	            } else {
	                sb.append("��");
	            }
	        }
	        return sb.toString();
	    }
	}
	
}
