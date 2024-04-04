package section05.problem01;

import java.util.Stack;
import java.util.Scanner;
public class Main {

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return "NO";
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
