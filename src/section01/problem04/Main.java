package section01.problem04;

import java.util.Scanner;
public class Main {

    public String[] solution(int n, String[] strArray) {
        String[] answer = new String[n];

        for(int i = 0; i < answer.length; i++) {
            answer[i] = "";
            for(int j = strArray[i].length()-1; j >= 0; j--) {
                answer[i] += strArray[i].charAt(j);
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] strArray = new String[n];
        for(int i = 0; i < n; i++) {
            strArray[i] = scanner.next();
        }
        String[] answer = main.solution(n, strArray);
        for(int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }
    }
}
