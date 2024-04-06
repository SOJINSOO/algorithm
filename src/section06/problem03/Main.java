package section06.problem03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] intArray) {
        for (int i = 1; i < n; i++) {
            int tmp = intArray[i];
            int j;
            for (j = i - 1; j >=0; j--) {
                if (intArray[j] > tmp) {
                    intArray[j+1] = intArray[j];
                } else {
                    break;
                }
            }
            intArray[j+1] = tmp;
        }

        return intArray;

    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        for (int i : main.solution(n, intArray)) {
            System.out.print(i + " ");
        }
    }
}
