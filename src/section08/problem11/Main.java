package section08.problem11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static int[][] board;
    private static int[][] dist;
    private int[] dx = {-1, 0, 1, 0};
    private int[] dy = {0, 1, 0, -1};

    private class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();

        queue.offer(new Point(x, y));

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            for (int j = 0; j < 4; j++) {
                int nx = cur.x + dx[j];
                int ny = cur.y + dy[j];
                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    dist[nx][ny] = dist[cur.x][cur.y] + 1;
                    queue.offer(new Point(nx, ny));
                }
            }
        }
    }
    private int solution(int[][] board) {
        BFS(1, 1);

        return dist[7][7];
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        board = new int[8][8];
        dist = new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=scanner.nextInt();
            }
        }

        System.out.print(main.solution(board));
    }
}
