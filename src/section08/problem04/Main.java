package section08.problem04;

import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static int[] permutation;
    public void DFS(int level) {
        if (level == m) {
            for (int i : permutation) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            permutation[level] = i;
            DFS(level + 1);
        }


    }

    public void solution(int n, int m) {
        DFS(0);
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        permutation = new int[m];

        main.solution(n, m);
    }
}
