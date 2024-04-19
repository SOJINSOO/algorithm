package section08.problem02;

import java.util.Scanner;

public class Main {
    public static int c;
    public static int n;
    public int answer = 0;

    public void DFS(int level, int sum, int[] intArray) {
        if (sum > c) {
            return;
        }

        if (level == n) {
            answer = Math.max(answer, sum);
            return;
        }

        DFS(level+1, sum + intArray[level], intArray);
        DFS(level+1, sum, intArray);
    }

    public int solution(int c, int n, int[] intArray) {
        int level = 0;

        DFS(level, 0, intArray);

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        c = scanner.nextInt();
        n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(c, n, intArray));
    }
}
