package section01.problem10;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        Arrays.fill(answer, Integer.MAX_VALUE);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer[i] = 0;
            } else {
                if (answer[i-1] != Integer.MAX_VALUE) {
                    answer[i] = Math.min(answer[i], answer[i - 1] + 1);
                }
            }
        }

        for (int i = str.length()-2; i >= 0; i--) {
            if (str.charAt(i) == c) {
                answer[i] = 0;
            } else {
                if (answer[i+1] != Integer.MAX_VALUE) {
                    answer[i] = Math.min(answer[i], answer[i+1] + 1);
                }
            }
        }

        return answer;

    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        for(int i : main.solution(str, c)) {
            System.out.print(i + " ");
        }


    }
}