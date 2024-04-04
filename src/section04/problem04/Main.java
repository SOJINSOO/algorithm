package section04.problem04;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> sHashMap = new HashMap<>();
        HashMap<Character, Integer> tHashMap = new HashMap<>();
        int lt = 0;

        for (char c : t.toCharArray()) {
            tHashMap.put(c, tHashMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length() -1; i++) {
            sHashMap.put(s.charAt(i), sHashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            sHashMap.put(s.charAt(rt), sHashMap.getOrDefault(s.charAt(rt), 0) + 1);
            if (sHashMap.equals(tHashMap)) {
                answer++;
            }
            sHashMap.put(s.charAt(lt), sHashMap.get(s.charAt(lt)) - 1);
            if (sHashMap.get(s.charAt(lt)) == 0) {
                sHashMap.remove(s.charAt(lt));
            }
            lt++;
        }

        return answer;
    }
    public static void main(String arg[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String t = scanner.next();

        System.out.print(main.solution(s, t));
    }
}
