package level2;

public class P154538 {

    class Solution {

        public int solution(int x, int y, int n) {

            int answer = 0;
            int[] dp = new int[y + 1];

            for(int i = 0; i <= y; i++) {
                dp[i] = Integer.MAX_VALUE;
            }

            dp[x] = 0;

            for(int i = x; i <= y; i++) {
                if(dp[i] == Integer.MAX_VALUE) {
                    continue;
                }

                if(i + n <= y) {
                    dp[i + n] = Math.min(dp[i + n], dp[i] + 1);
                }
                if(i * 2 <= y) {
                    dp[i * 2] = Math.min(dp[i * 2], dp[i] + 1);
                }
                if(i * 3 <= y) {
                    dp[i * 3] = Math.min(dp[i * 3], dp[i] + 1);
                }

            }

            if(dp[y] == Integer.MAX_VALUE) {
                return -1;
            }
            return dp[y];


        }

    }




// class Solution {

//     int ans = Integer.MAX_VALUE;

//     public int solution(int x, int y, int n) {
//         int answer = 0;

//         dfs(x, y, n, 0);

//         if(ans == Integer.MAX_VALUE) return -1;

//         return ans;
//     }

//     public void dfs(int x, int y, int n, int depth) {

//         if(x > y) return;
//         if(x == y) {
//             ans = Math.min(ans, depth);
//         }

//         dfs(x * 2, y, n, depth + 1);
//         dfs(x * 3, y, n, depth + 1);
//         dfs(x + n, y, n, depth + 1);
//     }
// }
    
}
