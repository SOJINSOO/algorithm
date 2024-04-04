package section04.problem02;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            hashMap1.put(c, hashMap1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            hashMap2.put(c, hashMap2.getOrDefault(c, 0) + 1);
        }

        if(!hashMap1.equals(hashMap2)) {
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
