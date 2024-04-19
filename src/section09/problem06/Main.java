package section09.problem06;

import java.util.Scanner;

public class Main {
    public static int[] unif;

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

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        unif = new int[n+1];
        for (int i = 1; i <= n; i++) {
            unif[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            union(a, b);
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (find(a) == find(b)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }

    }
}
