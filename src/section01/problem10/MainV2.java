package section01.problem10;

import java.util.Scanner;

public class MainV2 {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        int p = 100;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 100;

        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;

    }

    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        for(int i : main.solution(str, c)) {
            System.out.print(i + " ");
        }

    }
}