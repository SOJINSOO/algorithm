package section09.problem07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int[] unif;
    public static class Edge implements Comparable<Edge> {
        int v1;
        int v2;
        int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge target) {
            return this.cost - target.cost;
        }

    }
    public static int find(int value) {
        if (unif[value] == value) {
            return value;
        } else {
            unif[value] = find(unif[value]);
            return unif[value];
        }
    }
    public static void union(int a, int b) {
        int findA = find(a);
        int findB = find(b);

        if (findA != findB) {
            unif[findA] = findB;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int e = scanner.nextInt();
        ArrayList<Edge> edgeArray = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            edgeArray.add(new Edge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }
        unif = new int[v+1];
        for (int i = 1; i <= v; i++) {
            unif[i] = i;
        }

        Collections.sort(edgeArray);

        int cost = 0;
        for (Edge edge : edgeArray) {
            if (find(edge.v1) != find(edge.v2)) {
                union(edge.v1, edge.v2);
                cost += edge.cost;
            }
        }

        System.out.print(cost);
    }
}
