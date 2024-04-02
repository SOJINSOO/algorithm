package section01.problem04;

import java.util.ArrayList;
import java.util.Scanner;

public class MainV3 {

    public ArrayList<String> solution(int n, String[] strArray) {
        ArrayList<String> answer = new ArrayList<>();

        for (String str : strArray) {
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String args[]) {
        MainV3 main = new MainV3();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] strArray = new String[n];
        for(int i = 0; i < n; i++) {
            strArray[i] = scanner.next();
        }
        for(String str : main.solution(n, strArray)) {
            System.out.println(str);
        }
    }
}
