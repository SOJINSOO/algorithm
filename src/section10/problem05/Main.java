package section10.problem05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution(int n, int[] coins, int m) {
        int answer = 0;
        int[] dp = new int[m+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= m; j++) {
                dp[j] = Math.min(dp[j], dp[j-coins[i]] + 1);
            }
        }

        return dp[m];
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();;
        }
        int m = scanner.nextInt();

        System.out.print(main.solution(n, coins, m));
    }
}
