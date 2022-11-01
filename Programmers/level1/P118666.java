package level1;

public class P118666 {

	class Solution {
	    public String solution(String[] survey, int[] choices) {

	        int scoreRT = 0, scoreCF = 0, scoreJM = 0, scoreAN = 0;
	        
	        for(int i = 0; i < survey.length; i++) {
	            
	            String s = survey[i];
	            int score = 0;
	            
	            switch(choices[i]) {
	                case 1 : score -= 3; break;
	                case 2 : score -= 2; break;
	                case 3 : score -= 1; break;
	                case 4 : score = 0; break;
	                case 5 : score += 1; break;
	                case 6 : score += 2; break;
	                case 7 : score += 3; break;
	            }
	            
	            switch(s) {
	                case "RT" : scoreRT += score; break;
	                case "TR" : scoreRT -= score; break;
	                    
	                case "CF" : scoreCF += score; break;
	                case "FC" : scoreCF -= score; break;
	                
	                case "JM" : scoreJM += score; break;
	                case "MJ" : scoreJM -= score; break;
	                    
	                case "AN" : scoreAN += score; break;
	                case "NA" : scoreAN -= score; break;
	            }
	        }
	        
	        String a = "R"; 
	        String b = "C"; 
	        String c = "J"; 
	        String d = "A";
	        
	        if(scoreRT > 0) a = "T";
	        if(scoreCF > 0) b = "F";
	        if(scoreJM > 0) c = "M";
	        if(scoreAN > 0) d = "N";

	        return a+b+c+d;
	    }
	}
	
}
