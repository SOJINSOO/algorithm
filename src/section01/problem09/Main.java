package section01.problem09;

import java.util.Scanner;

public class Main {

    public int solution(String str) {
        int answer = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                answer = answer * 10 + Character.getNumericValue(c);
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
