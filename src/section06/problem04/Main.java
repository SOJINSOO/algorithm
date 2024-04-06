package section06.problem04;

import java.util.Scanner;

public class Main {
    public int[] solution(int s, int n, int[] intArray) {
        int[] answer = new int[s];

        for (int i : intArray) {
            boolean hit = false;

            for (int j = 0; j < s; j++) {
                // Cache Hit
                if (answer[j] == i) {
                    hit = true;
                    for (int k = j; k > 0 ; k--) {
                        answer[k] = answer[k-1];
                    }
                    answer[0] = i;
                    break;
                }
            }
            // Cache Miss
            if (!hit) {
                hit = false;
                for (int k = s-1; k > 0; k--) {
                    answer[k] = answer[k-1];
                }
                answer[0] = i;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i : main.solution(s, n, intArray)) {
            System.out.print(i + " ");
        }
    }
}
