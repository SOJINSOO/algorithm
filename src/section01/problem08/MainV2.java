package section01.problem08;

import java.util.Scanner;

public class MainV2 {

    public String solution(String str) {
        String answer = "YES";

        str = str.toLowerCase().replaceAll("[^a-z]", "");

        if (!str.equals(new StringBuilder(str).reverse().toString())) {
            return "NO";
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
