package section02.problem03;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public ArrayList<Character> solution(int n, int[] aArray, int[] bArray) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (aArray[i] == 1 && bArray[i] == 3) {
                answer.add('A');
            } else if (aArray[i] == 2 && bArray[i] == 1) {
                answer.add('A');
            } else if (aArray[i] == 3 && bArray[i] == 2) {
                answer.add('A');
            } else if (aArray[i] == bArray[i]) {
                answer.add('D');
            } else {
                answer.add('B');
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] aArray = new int[n];
        int[] bArray = new int[n];
        for (int i = 0; i < n; i++) {
            aArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bArray[i] = scanner.nextInt();
        }

        for (char c : main.solution(n, aArray, bArray)) {
            System.out.println(c);
        }
    }
}
