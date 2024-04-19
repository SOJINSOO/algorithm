package section09.problem05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int[] dist;
    public static ArrayList<ArrayList<Edge>> graph;
    public static class Edge implements Comparable<Edge> {
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge target) {
            return this.cost - target.cost;
        }

    }

    public void solution(int vex) {

        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(vex, 0));

        while (!queue.isEmpty()) {
            Edge current = queue.poll();
            int currentVex = current.vex;
            int currentCost = current.cost;
            if (dist[currentVex] < currentCost) {
                continue;
            }
            for (Edge e : graph.get(currentVex)) {
                if (dist[e.vex] > currentCost + e.cost) {
                    dist[e.vex] = currentCost + e.cost;
                    queue.offer(new Edge(e.vex, currentCost + e.cost));
                }
            }
        }

    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        for (int i = 0; i < m; i++) {
            graph.get(scanner.nextInt()).add(new Edge(scanner.nextInt(), scanner.nextInt()));
        }

        main.solution(1);
        for (int i = 2; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dist[i]);
            }
        }
    }
}
