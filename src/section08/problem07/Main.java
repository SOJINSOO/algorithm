package section08.problem07;

import java.util.Scanner;

public class Main {
    public int[][] dy = new int[35][35];

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        }

        dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
        return dy[n][r];
    }
    public int solution(int n, int r) {
        return DFS(n, r);
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r = scanner.nextInt();

        System.out.print(main.solution(n, r));
    }
}
