package section07.problem03;

import java.util.Scanner;
public class Main {

    public int recursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n * recursive(n-1);
    }
    public void solution(int n) {
        int answer = recursive(n);
        System.out.print(answer);
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        main.solution(n);
    }

}
