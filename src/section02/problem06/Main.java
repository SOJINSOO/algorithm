package section02.problem06;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public Integer[] solution(int n, int[] intArray) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i : intArray) {
            int num = 0;
            while (i > 0) {
                num = (num * 10) + (i % 10);
                i = i / 10;
            }
            if (isPrime(num)) {
                answer.add(num);
            }
        }

        return answer.toArray(new Integer[0]);
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
