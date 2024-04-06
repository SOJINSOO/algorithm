package section06.problem09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int count(int mid, int[] intArray) {
        int cnt = 1;
        int sum = 0;

        for (int i : intArray) {
            if (sum + i <= mid) {
                sum += i;
            } else {
                cnt++;
                sum = i;
            }
        }

        return cnt;
    }

    public int solution(int n, int m, int[] intArray) {
        int answer = 0;
        int lt = Arrays.stream(intArray).max().getAsInt();
        int rt = Arrays.stream(intArray).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(mid, intArray) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, m, intArray));
    }
}
