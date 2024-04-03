package section02.problem07;

import java.util.Scanner;
public class Main {

    public int solution(int n, int[] intArray) {
        int answer = 0;

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (intArray[i] == 0) {
                cnt = 0;
            } else {
                cnt++;
                answer += cnt;
            }
        }

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, intArray));
    }
}
