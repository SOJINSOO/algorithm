package section06.problem02;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] intArray) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (intArray[j] > intArray[j+1]) {
                    int tmp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = tmp;
                }
            }
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
