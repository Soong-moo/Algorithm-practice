package level2;

import java.util.HashMap;
public class P176963 {
    class Solution {
        public int[] solution(String[] name, int[] yearning, String[][] photo) {
            int[] answer = new int[photo.length];
            HashMap<String, Integer> hs = new HashMap<>();

            for(int i = 0; i < name.length; i++) {
                hs.put(name[i], yearning[i]);
            }

            for(int i = 0; i < photo.length; i++) {
                for(int j = 0; j < photo[i].length; j++) {
                    if(hs.containsKey(photo[i][j])) {
                        answer[i] += hs.get(photo[i][j]);
                    }
                }
            }

            return answer;
        }
    }
}
