package section02.problem01;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public ArrayList<Integer> solution(int n, int[] intArray) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(intArray[0]) ;

        for(int i = 1; i < n; i++) {
            if (intArray[i] > intArray[i-1]) {
                answer.add(intArray[i]);
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

        for (int i : main.solution(n, intArray)) {
            System.out.print(i + " ");
        }

    }
}
