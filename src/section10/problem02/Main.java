package section10.problem02;

import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int[] dp = new int[n+2];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n+1; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n+1];

    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.print(main.solution(n));
    }
}
