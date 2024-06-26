package section02.problem02;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] intArray) {
        int answer = 0;

        int max = intArray[0];
        answer++;

        for (int i = 1; i < n; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
                answer++;
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
