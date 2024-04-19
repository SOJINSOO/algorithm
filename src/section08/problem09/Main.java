package section08.problem09;

import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public int[] combination;
    public void DFS(int level, int startInt) {
        if (level == 2) {
            for (int i : combination) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for (int i = startInt; i <= n; i++) {
            combination[level] = i;
            DFS(level + 1, i + 1);
        }
    }

    public void solution(int n, int m) {
        combination = new int[m];
        int level = 0;
        int startInt = 1;
        DFS(level, startInt);
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();

        main.solution(n, m);

    }
}
