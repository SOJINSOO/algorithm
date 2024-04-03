package section02.problem09;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] intMatrix) {
        int answer = Integer.MIN_VALUE;

        // 각 행의 합, 각 행의 열 중 가장 큰 합 구하기
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += intMatrix[i][j];
                sum2 += intMatrix[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        // 두 큰 대각선 중 가장 큰 합 구하기
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += intMatrix[i][i];
            sum2 += intMatrix[i][n-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] intMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                intMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print(main.solution(n, intMatrix));
    }
}
