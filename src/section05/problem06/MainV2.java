package section05.problem06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainV2 {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.print(main.solution(n, k));
    }
}
