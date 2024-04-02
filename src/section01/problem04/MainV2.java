package section01.problem04;

import java.util.ArrayList;
import java.util.Scanner;

public class MainV2 {

    public ArrayList<String> solution(int n, String[] strArray) {
        ArrayList<String> answer = new ArrayList<>();

        for(String str : strArray) {
            String tmp = "";
            for(int j = str.length()-1; j >= 0; j--) {
                tmp += str.charAt(j);
            }
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String args[]) {
        MainV2 main = new MainV2();
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
