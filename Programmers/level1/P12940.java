package level1;

public class P12940 {
	
	class Solution {
	    public int[] solution(int n, int m) {
	        return new int[] {gcd(n,m), n * m / gcd(n,m)};
	    }
	    
	    private int gcd(int n, int m) {
	        if(n % m == 0) return m;
	        else return gcd(m, n%m);
	    }
	}
	
}
