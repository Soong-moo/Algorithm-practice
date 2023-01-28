package level1;

public class P17682 {

	class Solution {
	    public int solution(String dartResult) {

	        int[] round = new int[3];
	        int index = -1;
	        char[] dart = dartResult.toCharArray();
	        
	        for(int i = 0; i < dart.length; i++) {
	            
	            if(dart[i] >= '0' && dart[i] <= '9') {
	                index++;
	                round[index] += Integer.parseInt(String.valueOf(dart[i]));
	                
	                if(i + 1 != dart.length && dart[i] == '1' && dart[i + 1] == '0') {
	                    round[index] -= Integer.parseInt(String.valueOf(dart[i]));
	                    round[index] += 10;
	                    i++;
	                }
	            } 

	            else if(dart[i] == 'S') {
	                round[index] *= 1;
	            }
	            else if(dart[i] == 'D') {
	                round[index] *= round[index];
	            }
	            else if(dart[i] == 'T') {
	                round[index] *= round[index] * round[index];
	            }
	            else if(dart[i] == '*') {
	                if(index > 0) {
	                    round[index - 1] *= 2;
	                }
	                round[index] *= 2;
	            }
	            else if(dart[i] == '#') {
	                round[index] *= -1;
	            }
	        }
	                
	        return round[0] + round[1] + round[2];
	    }
	}
	
}
