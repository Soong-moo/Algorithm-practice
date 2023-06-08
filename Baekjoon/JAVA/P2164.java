import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2164 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        while(!queue.isEmpty()) {

            if(queue.size() > 1) {
                queue.poll();
            }
            if(queue.size() == 1) {
                System.out.println(queue.poll());
                break;
            }

            int back = queue.poll();
            queue.offer(back);
        }

    }
}
