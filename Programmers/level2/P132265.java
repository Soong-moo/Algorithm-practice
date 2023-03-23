package level2;

import java.util.HashMap;
public class P132265 {
    class Solution {
       public int solution(int[] topping) {
          int answer = 0;
          HashMap<Integer, Integer> first = new HashMap<>();
          HashMap<Integer, Integer> second = new HashMap<>();

            for(int i = 0; i < topping.length; i++) {
              second.put(topping[i], second.getOrDefault(topping[i], 0) + 1);
           }

           for(int i = 0; i < topping.length; i++) {
              first.put(topping[i], first.getOrDefault(topping[i], 0) + 1);

             if(second.get(topping[i]) - 1 == 0) {
                 second.remove(topping[i]);
             } else {
                 second.put(topping[i], second.get(topping[i]) - 1);
             }

             if(first.size() == second.size()) answer++;
         }

          return answer;
      }
    }
}