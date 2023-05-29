import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int k = Integer.parseInt(br.readLine());
        int top = 0;

        for(int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n != 0) {
                stack.push(n);
                top++;
            }
            else {
                stack.pop();
                top--;
            }
        }

        int sum = 0;

        for(int i = 0; i < top; i++) {
            sum += stack.pop();
        }

        System.out.println(sum);

    }
}
