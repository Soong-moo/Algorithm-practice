package level1;

import java.util.HashMap;
public class P160586 {
    class Solution {
        public int[] solution(String[] keymap, String[] targets) throws Exception {

            HashMap<Character, Integer> hs = new HashMap<>();
            int sum = 0;
            int[] answer = new int[targets.length];

            for(String s : keymap) {
                for(int i = 0; i < s.length(); i++) {
                    if(hs.containsKey(s.charAt(i)) && i < hs.get(s.charAt(i))) {
                        hs.put(s.charAt(i), i + 1);
                    } else {
                        hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), i + 1));
                    }
                }
            }

            for(int i = 0; i < targets.length; i++) {
                for(int j = 0; j < targets[i].length(); j++) {
                    if(!hs.containsKey(targets[i].charAt(j))) {
                        sum = -1;
                        break;
                    } else {
                        sum += hs.get(targets[i].charAt(j));
                    }
                }
                answer[i] = sum;
                sum = 0;
            }

            return answer;
        }
    }
}
