package section06.problem06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] intArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] copy = intArray.clone();
        Arrays.sort(intArray);

        for (int i = 0; i < n; i++) {
            if (intArray[i] != copy[i]) {
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
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
