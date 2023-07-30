package level2;

public class P131127 {

    class Solution {
        public int solution(String[] want, int[] number, String[] discount) {
            int answer = 0;

            for(int i = 0; i < discount.length - 9; i++) {
                int cnt = 0;
                for(int j = 0; j < want.length; j++) {
                    int want_num = 0;
                    for(int k = i; k < i + 10; k++) {
                        if(want[j].equals(discount[k])) {
                            want_num++;
                        }
                    }
                    if(want_num < number[j]) break;
                    else cnt++;
                }
                if(cnt == want.length) answer++;
            }

            return answer;
        }
    }

}
