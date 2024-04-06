package section06.problem01;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] intArray) {
        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i+1; j < n; j++) {
                if (intArray[j] < intArray[idx]) {
                    idx = j;
                }
            }
            int tmp = intArray[idx];
            intArray[idx] = intArray[i];
            intArray[i] = tmp;
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
