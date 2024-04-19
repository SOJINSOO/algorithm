package section08.problem13;

import java.util.Scanner;

public class Main {
    private static int n;
    private static int[][] board;
    private int answer;
    private int[] dx = {-1, -1, 0, 1, 1, 1, 0 ,-1};
    private int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    private void DFS(int x, int y) {

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny);
            }
        }

    }
    private int solution(int n, int[][] board) {
        answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    DFS(i, j);
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        System.out.print(main.solution(n, board));

    }
}
