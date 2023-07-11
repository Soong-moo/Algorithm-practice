package level1;

import java.util.HashMap;

public class P178871 {
    class Solution {
        public String[] solution(String[] players, String[] callings) {

            HashMap<String, Integer> hs = new HashMap<>();

            for(int i = 0; i < players.length; i++) {
                hs.put(players[i], i);
            }

            for(int i = 0; i < callings.length; i++) {
                int index = hs.get(callings[i]);
                hs.put(players[index], index - 1);
                hs.put(players[index - 1], hs.get(players[index - 1]) + 1);

                String temp = players[index];
                players[index] = players[index - 1];
                players[index - 1] = temp;
            }

            return players;
        }
    }

}
