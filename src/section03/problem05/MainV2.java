package section03.problem05;

import java.util.Scanner;

public class MainV2 {

    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
        n--;

        while (n > cnt) {
            cnt++;
            n -= cnt;
            if(n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.print(main.solution(n));
    }
}
