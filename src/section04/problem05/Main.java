package section04.problem05;

import java.util.Collections;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] intArray) {
        int answer = -1;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(intArray[i]+intArray[j]+intArray[l]);
                }
            }
        }

        for (int i : treeSet) {
            cnt++;
            System.out.println(i);
            if (cnt == k) {
                answer = i;
            }
        }

        return answer;
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

        System.out.print(main.solution(n, k, intArray));
    }
}
