package section03.problem03;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] intArray) {
        int answer = 0;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += intArray[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (intArray[i] - intArray[i-k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] intArray = new int [n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, k, intArray));
    }
}
