package section04.problem02;

import java.util.HashMap;
import java.util.Scanner;

public class MainV2 {

    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0) {
                return "NO";
            }
            hashMap.put(c, hashMap.get(c) -1);
        }

        return answer;
    }
    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.print(main.solution(str1, str2));
    }
}
