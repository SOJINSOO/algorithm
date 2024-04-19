package section08.problem03;

import java.util.Scanner;

public class Main {

    public static int answer = 0;
    public static int n;
    public static int m;

    public static class Problem {
        int score;
        int time;

        public Problem(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }

    public void DFS(int level, int sum, int time, Problem[] problems) {
        if (time > m) {
            return;
        }

        if (level == n) {
            if (time <= m) {
                answer = Math.max(answer, sum);
                return;
            }
            return;
        }

        DFS(level + 1, sum + problems[level].score, time + problems[level].time, problems);
        DFS(level + 1, sum, time, problems);

    }

    public int solution(int n, int m, Problem[] problems) {
        int level = 0;
        DFS(level, 0, 0, problems);
        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        Problem[] problems = new Problem[n];
        for (int i = 0; i < n; i++) {
            problems[i] = new Problem(scanner.nextInt(), scanner.nextInt());
        }

        System.out.print(main.solution(n, m, problems));
    }
}
