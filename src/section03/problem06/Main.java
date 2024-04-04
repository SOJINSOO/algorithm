package section03.problem06;

import java.util.Scanner;
public class Main {
    public int solution(int n, int k, int[] intArray) {
        int answer = 0;
        int lt = 0;
        int cnt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (intArray[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (intArray[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, k, intArray));
    }
}
