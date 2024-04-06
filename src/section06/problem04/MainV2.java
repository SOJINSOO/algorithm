package section06.problem04;

import java.util.Scanner;

public class MainV2 {
    public int[] solution(int s, int n, int[] intArray) {
        int[] cache = new int[s];

        for (int i : intArray) {
            int pos = -1;
            // pos != -1; Cache hit
            for (int j = 0; j < s; j++) {
                if (cache[j] == i) {
                    pos = j;
                    break;
                }
            }
            //Cache Hit
            if (pos != -1) {
                for (int k = pos; k > 0; k--) {
                    cache[k] = cache[k-1];
                }
                cache[0] = i;
            // Cache Miss
            } else {
                for (int k = s-1; k > 0; k--) {
                    cache[k] = cache[k-1];
                }
                cache[0] = i;
            }
        }

        return cache;
    }

    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i : main.solution(s, n, intArray)) {
            System.out.print(i + " ");
        }
    }
}
