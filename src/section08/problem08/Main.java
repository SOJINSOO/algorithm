package section08.problem08;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static int[] permutation;

    public void DFS(int level) {

    }

    public void solution(int n, int f) {
        permutation = new int[n];

        int level = 0;
        DFS(level);

    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int f = scanner.nextInt();

        main.solution(n, f);
    }
}