package level2;

import java.util.Stack;

public class P131704 {

    class Solution {
        public int solution(int[] order) {

            Stack<Integer> stack = new Stack<>();
            int answer = 0;
            int index = 0;
            for(int i = 1; i <= order.length; i++) {
                if(order[index] != i) {
                    stack.push(i);
                } else {
                    index++;
                    answer++;
                }
                while(!stack.isEmpty() && stack.peek() == order[index]) {
                    stack.pop();
                    index++;
                    answer++;
                }
            }

            return answer;
        }
    }

}
