package section01.problem06;

import java.util.Scanner;

public class MainV2 {

    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++){
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
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
