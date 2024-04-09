package section07.problem14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static int n;
    private static int m;
    private static ArrayList<ArrayList<Integer>> arrayList;
    private static int[] check;
    private static int[] dist;

    public void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        check[1] = 1;
        queue.add(node);

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int i : arrayList.get(cur)) {
                if (check[i] == 0) {
                    check[i] = 1;
                    queue.offer(i);
                    dist[i] = dist[cur] + 1;
                }
            }
        }
    }
    public int[] solution(int n, int m, ArrayList<ArrayList<Integer>> arrayList) {

        check = new int[n+1];
        dist = new int[n+1];
        BFS(1);

        return dist;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        arrayList = new ArrayList<>();
        for (int i = 0; i <= m; i++) {
            arrayList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            arrayList.get(scanner.nextInt()).add(scanner.nextInt());
        }

        int[] dist = main.solution(n, m, arrayList);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dist[i]);
        }

    }
}
