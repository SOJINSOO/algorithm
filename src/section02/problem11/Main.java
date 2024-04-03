package section02.problem11;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] intMatrix) {
        int answer = Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n ; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (intMatrix[i][k] == intMatrix[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] intMatrix = new int[n+1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                intMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print(main.solution(n, intMatrix));
    }
}
