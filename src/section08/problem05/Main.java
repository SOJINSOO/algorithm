package section08.problem05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int[] coins;

    public int BFS(int level) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                for (int coin : coins) {
                    if (cur + coin == 15) {
                        return level + 1;
                    }
                    queue.offer(cur + coin);
                }
            }
            level++;
        }

        return level;

    }

    public int solution(int n, int m, int[] coins) {
        int answer = 0;
        int level = 0;
        answer = BFS(level);

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        m = scanner.nextInt();

        System.out.print(main.solution(n, m, coins));
    }
}
