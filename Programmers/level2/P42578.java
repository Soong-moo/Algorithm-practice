package level2;

import java.util.HashMap;

public class P42578 {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 1;
            // 옷의 종류, 옷의 개수
            HashMap<String, Integer> hs = new HashMap<>();

            for(int i = 0; i < clothes.length; i++) {
                hs.put(clothes[i][1], hs.getOrDefault(clothes[i][1], 0) + 1);
            }

            // 옷을 안 고르는 경우 + 1
            for(String wear : hs.keySet()) {
                answer *= hs.get(wear) + 1;
            }

            // 아무 것도 안 고르는 경우 - 1
            return answer - 1;
        }
    }
}
