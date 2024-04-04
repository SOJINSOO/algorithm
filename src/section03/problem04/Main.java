package section03.problem04;

import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] intArray) {
        int answer = 0;
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < n; rt ++) {
            sum += intArray[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= intArray[lt];
                lt++;
                if(sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, m, intArray));
    }
}
