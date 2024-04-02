package section01.problem05;

import java.util.Scanner;
public class Main {

    public String solution(String str) {
        String answer;
        char[] charArray = str.toCharArray();
        int len = str.length();

        int lt = 0;
        int rt = len-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(charArray);
        return answer;

    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.print(main.solution(str));
    }
}
