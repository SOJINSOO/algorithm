package section07.problem06;

import java.util.Scanner;

public class Main {
    static int n;
    static int[] check;
    public void DFS(int level) {
        if (level == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() != 0) {
                System.out.println(tmp);
            }
            return;
        }
        check[level] = 1;
        DFS(level + 1);
        check[level] = 0;
        DFS(level + 1);
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        check = new int[n+1];

        main.DFS(1);
    }
}
