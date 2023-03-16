public class P161989 {

    class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int next = 0; // 다음 칠할 곳

            for(int i = 0; i < section.length; i++) {
                if(section[i] < next) {
                    continue;
                }

                answer++;
                next = section[i] + m;
            }

            return answer;
        }
    }

}