package section03.problem02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[] solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int point1 = 0;
        int point2 = 0;

        while (point1 < n && point2 < m) {
            if (a[point1] < b[point2]) {
                point1++;
            } else if (b[point2] < a[point1]) {
                point2++;
            } else {
                answer.add(a[point1]);
                point1++;
                point2++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i : main.solution(n, m, a, b)) {
            System.out.print(i + " ");
        }
    }

}
