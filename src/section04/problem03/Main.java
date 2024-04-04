package section04.problem03;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public int[] solution(int n, int k, int[] intArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < k; i++) {
            hashMap.put(intArray[i], hashMap.getOrDefault(intArray[i], 0) + 1);
        }
        answer.add(hashMap.size());

        for (int i = k; i < n; i++) {
            hashMap.put(intArray[i], hashMap.getOrDefault(intArray[i], 0) + 1);
            hashMap.put(intArray[i-k], hashMap.get(intArray[i-k]) - 1);
            if (hashMap.get(intArray[i-k]) == 0) {
                hashMap.remove(intArray[i-k]);
            }
            answer.add(hashMap.size());
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i : main.solution(n, k, intArray)) {
            System.out.print(i + " ");
        }
    }
}
