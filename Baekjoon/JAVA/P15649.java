import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P15649 {

    static int[] array; // 수 대입
    static boolean[] check; // 방문 여부 확인
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 깊이
        int M = Integer.parseInt(st.nextToken()); // 출력 길이

        check = new boolean[N + 1];
        array = new int[M + 1];

        dfs(N, M, 0);

        System.out.println(sb);

    }
    
    public static void dfs(int N, int M, int depth) {
        
        if(depth == M) {
            for(int i = 0; i < M; i++) {
                sb.append(array[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i = 1; i <= N; i++) {
            if(!check[i]) {
                check[i] = true; // 방문
                array[depth] = i; // 값 대입
                dfs(N, M, depth + 1); // 재귀 호출로 깊이 + 1 한 상태로 다시
                check[i] = false; // 방문 취소
            }
        }
    }
}
