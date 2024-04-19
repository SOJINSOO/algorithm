package section08.problem06;

import java.util.Scanner;

public class Main {
    public static int n;
    public static int m;
    public static int[] intArray;
    public static int[] check;
    public static int[] permutation;
    public void DFS(int level) {

        if (level == m) {
            for (int i : permutation) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (check[i] == 0) {
                check[i] = 1;
                permutation[level] = intArray[i];
                DFS(level + 1);
                check[i] = 0;
            }
        }



    }
    public void solution(int n, int m, int[] intArray) {
        check = new int[n];
        permutation = new int[m];
        int level = 0;

        DFS(level);
    }


    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        intArray = new int[3];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        main.solution(n, m, intArray);

    }
}
