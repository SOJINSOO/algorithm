package section01.problem01;

import java.util.Scanner;

public class Main {

    public int solution(String str, char c) {
        int answer = 0;

        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        for(char x : str.toCharArray()) {
            if(x == c) {
                answer++;
            }
        }

        return answer;

    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        char c = scanner.next().charAt(0);

        System.out.print(main.solution(str, c));
    }
}