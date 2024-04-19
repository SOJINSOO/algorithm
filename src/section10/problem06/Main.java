package section10.problem06;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] dp = new int[m+1];
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();
            for (int j = m; j >= time ; j--) {
                dp[j] = Math.max(dp[j], dp[j-time] + score);
            }
        }

        System.out.print(dp[m]);

    }
}
