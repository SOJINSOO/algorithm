package section03.problem01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public int[] solution(int n, int m, int[] intArray1, int[] intArray2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int point1 = 0;
        int point2 = 0;

        while(point1 < n && point2 < m) {
            if (intArray1[point1] <= intArray2[point2]) {
                answer.add(intArray1[point1]);
                point1++;
            } else {
                answer.add(intArray2[point2]);
                point2++;
            }
        }

        while(point1 < n) {
            answer.add(intArray1[point1]);
            point1++;
        }
        while(point2 < m) {
            answer.add(intArray2[point2]);
            point2++;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] intArray1 = new int[n];
        for (int i = 0; i < n; i++) {
            intArray1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] intArray2 = new int[m];
        for (int i = 0; i < m; i++) {
            intArray2[i] = scanner.nextInt();
        }

        for (int i: main.solution(n, m, intArray1, intArray2)) {
            System.out.print(i + " ");
        }
    }
}
