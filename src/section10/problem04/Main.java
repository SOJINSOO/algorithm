package section10.problem04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static class Brick implements Comparable<Brick> {

        int width;
        int height;
        int weight;

        public Brick(int width, int height, int weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Brick target) {
            return target.width - this.width;
        }

    }

    public int solution(int n, ArrayList<Brick> brickArray) {
        int answer = Integer.MIN_VALUE;
        int[] dp = new int[n];
        Collections.sort(brickArray);
        dp[0] = brickArray.get(0).height;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i-1; j >= 0; j--) {
                if (brickArray.get(j).weight > brickArray.get(i).weight &&
                    dp[j] > max) {
                    max = dp[j];
                }
                dp[i] = max + brickArray.get(i).height;
            }
            answer = Math.max(answer, dp[i]);
        }
        return answer;

    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Brick> brickArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            brickArray.add(new Brick(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        }

        System.out.print(main.solution(n, brickArray));

    }
}
