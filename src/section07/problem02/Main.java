package section07.problem02;

import java.util.Scanner;

public class Main {
    public void recursive(int n) {
        if (n == 0) {
            return;
        }
        recursive(n/2);
        System.out.print(n % 2);
    }
    public void solution(int n) {
        recursive(n);
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        main.solution(n);
    }
}
