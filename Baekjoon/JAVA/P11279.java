import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class P11279 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num != 0) {
                queue.add(num);
            } else {
                System.out.println(queue.isEmpty() ? 0 : queue.poll());
            }
        }

    }
}
