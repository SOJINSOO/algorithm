package section09.problem04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static class Lecture implements Comparable<Lecture> {
        int money;
        int day;

        public Lecture(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Lecture target) {
            return target.money - this.money;
        }
    }

    public int solution(int n, ArrayList<Lecture> lectureArray, int max) {
        int answer = 0;
        PriorityQueue<Lecture> queue = new PriorityQueue<>();

        for (int i = max; i >= 1; i--) {
            for (Lecture lecture : lectureArray) {
                if (lecture.day == i) {
                    queue.offer(lecture);
                }
            }
            Lecture lecture = queue.poll();
            answer += lecture.money;
        }

        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Lecture> lectureArray = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int money = scanner.nextInt();
            int day = scanner.nextInt();
            lectureArray.add(new Lecture(money, day));
            max = Math.max(max, day);
        }

        System.out.print(main.solution(n, lectureArray, max));
    }
}
