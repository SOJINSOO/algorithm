package section01.problem09;

import java.util.Scanner;

public class MainV2 {

    public int solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.parseInt(answer);
    }
    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.print(main.solution(str));
    }
}
