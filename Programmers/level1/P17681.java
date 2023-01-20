package level1;

public class P17681 {
	
	class Solution {
	    public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        
	        for(int i = 0; i < n; i++){
	            String str = "";
	            String a = getBinary(n, arr1[i]);
	            String b = getBinary(n, arr2[i]);
	            
	            for(int j = 0; j < n; j++){
	                if(a.charAt(j) == '1' || b.charAt(j) == '1') {str += "#";}
	                else {str += " ";}
	            }
	            answer[i] = str;
	        }
	        return answer;
	    }
	    
	    private String getBinary(int n, int num){
	        String binary = Integer.toBinaryString(num);
	        int len = binary.length();
	        for(int i = 0; i<n - len; i++) {
	            binary = "0" + binary;
	        }
	        return binary;
	    }
	}
}
