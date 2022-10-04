package level2;

import java.util.StringTokenizer;

public class P12939 {

	class Solution {
		public String solution(String s) {
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			int i = 0;
			StringTokenizer st = new StringTokenizer(s, " ");

			int[] sa = new int[st.countTokens()];

			while (st.hasMoreTokens()) {
				sa[i] = Integer.parseInt(st.nextToken());
				if (min > sa[i])
					min = sa[i];
				if (max < sa[i])
					max = sa[i];
				i++;
			}
			return "" + min + " " + max;
		}
	}
}

/* 2Â÷ Ç®ÀÌ
	String[] arr = s.split(" ");
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	
	for(int i = 0; i < arr.length; i++) {
	if(min > Integer.parseInt(arr[i])) min = Integer.parseInt(arr[i]));
	if(max < Integer.parseInt(arr[i])) max = Integer.parseInt(arr[i]));
	}
	
	return "" + min + " " + max;
*/