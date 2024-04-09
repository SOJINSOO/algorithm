package section07.problem08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    Queue<Integer> queue= new LinkedList<>();
    int[] dist = {5, 1, -1};
    int[] check = new int[10001];
    public int BFS(int s, int e) {
        int level = 0;
        check[s] = 1;
        queue.offer(s);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = current + dist[j];
                    if (nx == e) {
                        return level + 1;
                    }
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }

        return level;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int e = scanner.nextInt();

        System.out.print(main.BFS(s, e));
    }
}
