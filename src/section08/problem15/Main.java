package section08.problem15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int answer = Integer.MAX_VALUE;
    private static int n;
    private static int m;
    private static int[][] board;
    private static ArrayList<Point> house;
    private static ArrayList<Point> pizza;
    private static int[] combi;

    private class Point {
        int x;
        int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void DFS(int level, int start) {

        if (level == m) {
            int sum = 0;

            for (Point h : house) {
                int dist = Integer.MAX_VALUE;
                for (int i : combi) {
                    dist = Math.min(dist, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dist;
            }

            answer = Math.min(answer, sum);
            return;
        }

        for (int i = start; i < pizza.size(); i++) {
            combi[level] = i;
            DFS(level + 1, i + 1);
        }

    }

    private int solution(int n, int m, int[][] board) {
        house = new ArrayList<>();
        pizza = new ArrayList<>();
        combi = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    house.add(new Point(i, j));
                }
                if (board[i][j] == 2) {
                    pizza.add(new Point(i, j));
                }
            }
        }

        DFS(0, 0);
        return answer;
    }
    public static void main(String args[]) {

        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        System.out.print(main.solution(n, m, board));
    }
}
