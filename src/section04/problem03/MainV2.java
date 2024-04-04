package section04.problem03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainV2 {
    public int[] solution(int n, int k, int[] intArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int lt = 0;
        for (int i = 0; i < k-1; i++) {
            hashMap.put(intArray[i], hashMap.getOrDefault(intArray[i], 0) + 1);
        }

        for (int rt = k-1; rt < n; rt++) {
            hashMap.put(intArray[rt], hashMap.getOrDefault(intArray[rt], 0) + 1);
            answer.add(hashMap.size());
            hashMap.put(intArray[lt], hashMap.get(intArray[lt]) - 1);
            if (hashMap.get(intArray[lt]) == 0) {
                hashMap.remove(intArray[lt]);
            }
            lt++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String args[]) {
        MainV2 main = new MainV2();
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
