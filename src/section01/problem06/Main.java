package section01.problem06;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if (answer.indexOf(c) == -1) {
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.print(main.solution(str));
    }
}
