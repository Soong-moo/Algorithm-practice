import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P1021 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken()); // 큐의 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑을 개수

        for(int i = 1; i <= N; i++) {
            deque.add(i);
        }

        int[] number = new int[M];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        int count  = 0;

        for(int i = 0; i < M; i++) {
            while(deque.getFirst() != number[i]) {

                if(deque.indexOf(number[i]) > deque.size() / 2) {
                    deque.addFirst(deque.getLast());
                    deque.removeLast();
                } else {
                    deque.addLast(deque.getFirst());
                    deque.removeFirst();
                }

                count++;
            }
            if(deque.getFirst() == number[i]) {
                deque.removeFirst();
            }
        }

        System.out.println(count);


    }
}
