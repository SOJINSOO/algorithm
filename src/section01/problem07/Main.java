package section01.problem07;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "YES";

        str = str.toLowerCase();
        int len = str.length();

        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) {
                return "NO";
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
