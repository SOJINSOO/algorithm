package section07.problem12;

import java.util.Scanner;

public class Main {
    public static int answer;
    public static int n;
    public static int m;
    public static int[][] intMatrix;
    public static int[] check;

    public void DFS(int node) {
        if (node == 5) {
            answer++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (intMatrix[node][i] == 1 && check[i] == 0) {
                check[i] = 1;
                DFS(i);
                check[i] = 0;
            }
        }

    }

    public int solution(int n, int m, int[][] intMatrix) {
        answer = 0;
        check[1] = 1;
        DFS(1);
        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        intMatrix = new int[n+1][n+1];
        check = new int[n+1];
        for (int i = 0; i < m; i++) {
            intMatrix[scanner.nextInt()][scanner.nextInt()] = 1;
        }

        System.out.print(main.solution(n, m, intMatrix));
    }
}
