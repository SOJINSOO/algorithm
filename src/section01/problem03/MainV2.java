package section01.problem03;

import java.util.Scanner;

public class MainV2 {

    public String solution(String str) {
        String answer = "";

        for(String s : str.split(" ")) {
            if(s.length() > answer.length()) {
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.print(main.solution(str));

    }
}
