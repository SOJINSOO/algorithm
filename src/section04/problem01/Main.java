package section04.problem01;

import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public char solution(int n, String str) {
        char answer = ' ';

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char key : hashMap.keySet()) {
            if (hashMap.get(key) > max) {
                answer = key;
                max = hashMap.get(key);
            }
        }

        return answer;

    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();

        System.out.print(main.solution(n, str));
    }
}
