package section05.problem02;

import java.util.Stack;
import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != ')') {
                stack.push(c);
            } else {
                while (stack.pop() != '(');
            }
        }

//        for (int i = 0; i < stack.size(); i++) {
//            answer += stack.get(i);
//        }

        for (char c : stack) {
            answer += c;
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
