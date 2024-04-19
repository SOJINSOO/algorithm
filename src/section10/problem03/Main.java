package section10.problem03;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] intArray) {
        int answer = Integer.MIN_VALUE;
        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (intArray[j] < intArray[i] && dp[j] > max) {
                    max = dp[j];
                }
                dp[i] = max + 1;
            }
            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, intArray));

    }
}
