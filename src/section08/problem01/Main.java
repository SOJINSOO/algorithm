package section08.problem01;

import java.util.Scanner;

public class Main {
    private static String answer = "NO";
    private static int n;
    private static int total = 0;
    public void DFS(int level, int sum, int[] intArray) {
        if (answer == "YES") {
            return;
        }
        if (sum > total / 2) {
            return;
        }

        if (level == n) {
            if (total - sum == sum) {
                System.out.println(total);
                System.out.println(sum);
                answer = "YES";
                return;
            }
            return;
        }

        DFS(level + 1, sum + intArray[level], intArray);
        DFS(level + 1, sum, intArray);

    }
    public String solution(int n, int[] intArray) {

        int level = 0;
        DFS(level, 0, intArray);
        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
            total += intArray[i];
        }

        System.out.print(main.solution(n, intArray));
    }
}
