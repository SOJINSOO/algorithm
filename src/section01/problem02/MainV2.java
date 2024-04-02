package section01.problem02;

import java.util.Scanner;

public class MainV2 {

    public String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if (Character.isLowerCase(x) == true) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.print(main.solution(str));
    }
}
