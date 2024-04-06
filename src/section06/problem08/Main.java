package section06.problem08;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] intArray) {
        int answer = -1;
        Arrays.sort(intArray);
        int lt = 0;
        int rt = n-1;

        while (lt <= rt) {
            int mid = (rt + lt) / 2;

            if (intArray[mid] == m) {
                answer = mid + 1;
                break;
            } else if (intArray[mid] > m) {
                rt = mid - 1;
            } else  {
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
