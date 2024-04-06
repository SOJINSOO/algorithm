package section06.problem05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public char solution(int n, int[] intArray) {
        char answer = 'U';
        Arrays.sort(intArray);

        for (int i = 0; i < n-1; i++) {
            if (intArray[i] == intArray[i+1]) {
                return 'D';
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, intArray));
    }
}
