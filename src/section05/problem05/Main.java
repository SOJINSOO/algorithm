package section05.problem05;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char prevChar = ' ';

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (prevChar == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
            prevChar = c;
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
