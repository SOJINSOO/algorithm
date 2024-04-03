package section02.problem12;

import java.util.Scanner;

public class Main {
    public int solution(int n , int m, int[][] intMatrix) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int rank1 = 0;
                    int rank2 = 0;
                    for (int l = 0; l < n; l++) {
                        if (intMatrix[k][l] == i) {
                            rank1 = l;
                        }
                        if (intMatrix[k][l] == j) {
                            rank2 = l;
                        }
                    }
                    if (rank1 < rank2) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] intMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                intMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print(main.solution(n, m, intMatrix));
    }
}
