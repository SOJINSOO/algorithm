package section05.problem07;

import section05.problem06.MainV2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for (char c : str1.toCharArray()) {
            queue.offer(c);
        }

        for (char c : str2.toCharArray()) {
            if (queue.contains(c)) {
                if (queue.poll() != c) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.print(main.solution(str1, str2));
    }
}
