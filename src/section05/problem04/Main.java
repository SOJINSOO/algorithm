package section05.problem04;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str) {
        int answer = -1;
        Stack<Integer> stack = new Stack<>();
        int leftValue = 0;
        int rightValue = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c-48);
            } else {
                rightValue = stack.pop();
                leftValue = stack.pop();
                if (c == '+') {
                    stack.push((leftValue + rightValue));
                } else if (c == '-') {
                    stack.push((leftValue - rightValue));
                } else if (c == '*') {
                    stack.push((leftValue * rightValue));
                } else if (c == '/') {
                    stack.push((leftValue / rightValue));
                } else {
                    return answer;
                }
            }
        }
        answer = stack.get(0);

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.print(main.solution(str));
    }
}
