package section08.problem14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int n;
    private static int[][] board;
    private int answer;
    private int[] dx = {-1, -1, 0, 1, 1, 1, 0 ,-1};
    private int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    private class Point {
        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();

        queue.offer(new Point(x, y));

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            for (int i = 0; i < 8; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Point(nx, ny));
                }
            }
        }

    }
    private int solution(int n, int[][] board) {
        answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    BFS(i, j);
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
