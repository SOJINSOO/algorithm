package section06.problem10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int count(int dist, int[] intArray) {
        int cnt = 1;
        int endPoint = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (endPoint + dist <= intArray[i]) {
                cnt++;
                endPoint = intArray[i];
            }
        }

        return cnt;
    }
    public int solution(int n, int c, int[] intArray) {
        int answer = 0;
        Arrays.sort(intArray);
        int lt = 1;
        int rt = intArray[intArray.length-1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (count(mid, intArray) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, c, intArray));
    }
}
