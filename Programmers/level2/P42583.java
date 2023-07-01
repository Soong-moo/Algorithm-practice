package level2;

import java.util.Queue;
import java.util.LinkedList;
public class P42583 {

    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int sum = 0;
            int time = 0;

            Queue<Integer> queue = new LinkedList<>();

            for(int i = 0; i < truck_weights.length; i++) {

                int truck = truck_weights[i];

                while(true) {

                    if(queue.isEmpty()) {
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else if(queue.size() == bridge_length) {
                        sum -= queue.poll();
                    } else {
                        if(sum + truck <= weight) {
                            queue.add(truck);
                            sum += truck;
                            time++;
                            break;
                        } else {
                            queue.add(0);
                            time++;
                        }
                    }

                }

            }

            return time + bridge_length;
        }
    }
}
