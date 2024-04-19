package section09.problem08;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

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
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int e = scanner.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<Edge>());
        }
        for (int i = 0; i < e; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            graph.get(a).add(new Edge(b, c));
            graph.get(b).add(new Edge(a, c));
        }

        int[] check = new int[v+1];
        int cost = 0;
        PriorityQueue<Edge> queue = new PriorityQueue<>();

        queue.offer(new Edge(1, 0));

        while (!queue.isEmpty()) {
            Edge currentEdge = queue.poll();
            if (check[currentEdge.vex] == 0) {
                check[currentEdge.vex] = 1;
                cost += currentEdge.cost;
                for (Edge edge : graph.get(currentEdge.vex)) {
                    if (check[edge.vex] == 0) {
                        queue.offer(edge);
                    }
                }
            }
        }
        System.out.print(cost);
    }
}
