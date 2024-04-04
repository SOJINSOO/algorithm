package section05.problem06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        int tmp = 0;
        while (queue.size() > 1) {
            cnt++;
            tmp = queue.poll();
            if (cnt == k) {
                cnt = 0;
            } else {
                queue.offer(tmp);
            }
        }
        answer = queue.poll();

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.print(main.solution(n, k));
    }
}
