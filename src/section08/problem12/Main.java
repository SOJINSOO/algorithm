package section08.problem12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int m;
    private static int n;
    private static int[][] board;
    private static int[][] dist;
    private int[] dx = {-1, 0, 1, 0};
    private int[] dy = {0, 1, 0, -1};

    private class Point {
        private int x;
        private int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    private void BFS() {
        Queue<Point> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    queue.offer(new Point(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            Point cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    dist[nx][ny] = dist[cur.x][cur.y] + 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }
    private int solution(int m, int n, int[][] board) {
        int answer = 0;
        dist = new int[n][m];

        BFS();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = Math.max(answer, dist[i][j]);
                if (board[i][j] == 0) {
                    return -1;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        m = scanner.nextInt();
        n = scanner.nextInt();
        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        System.out.print(main.solution(m, n, board));

    }
}
