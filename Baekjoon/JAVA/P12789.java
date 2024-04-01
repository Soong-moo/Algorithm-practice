import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P12789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = 1;

        for(int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        while(!queue.isEmpty()) {
            if(queue.peek() == start) {
                queue.poll();
                start++;
            }else if(!stack.isEmpty() && stack.peek() == start) {
                stack.pop();
                start++;
            }else {
                stack.push(queue.poll());
            }
        }

// 실패 코드
//        for(int i = 0; i < N; i++) {
//            if(queue.peek() == start) {
//                queue.poll();
//                start++;
//            } else {
//                if(!stack.isEmpty() && stack.peek() == start) {
//                    stack.pop();
//                    start++;
//                } else {
//                    stack.push(queue.poll());
//                }
//            }
//
//        }

        while(!stack.isEmpty()) {
            if(stack.peek() == start) {
                stack.pop();
                start++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");

    }
}
