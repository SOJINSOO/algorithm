package section01.problem02;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            // 대문자 알파뱃 : 65~90
            // 소문자 알파뱃 : 97~122
            char newChar;
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                newChar = (char)(str.charAt(i) + 32);
            } else {
                newChar = (char)(str.charAt(i) - 32);
            }
            answer += String.valueOf(newChar);
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
