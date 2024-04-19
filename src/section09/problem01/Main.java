package section09.problem01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static class Body implements Comparable<Body> {
        int height;
        int weight;

        public Body(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }
        @Override
        public int compareTo(Body target) {
            return target.height - this.height;
        }
    }

    public int solution(int n, ArrayList<Body> bodyArray) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        Collections.sort(bodyArray);

        for (Body body : bodyArray) {
            if (body.weight > max) {
                max = body.weight;
                answer++;
            }
        }

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Body> bodyArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            int weight = scanner.nextInt();
            bodyArray.add(new Body(height, weight));
        }

        System.out.print(main.solution(n, bodyArray));
    }
}
