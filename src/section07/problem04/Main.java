package section07.problem04;

import java.util.Scanner;

public class Main {
    public int recursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return recursive(n-2) + recursive(n-1);

    }

    public void solution(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(recursive(i) + " ");
        }
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        main.solution(n);
    }
}
