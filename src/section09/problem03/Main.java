package section09.problem03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static class Time implements Comparable<Time> {

        char state;
        int time;

        public Time(char state, int time) {
            this.state = state;
            this.time = time;
        }

        @Override
        public int compareTo(Time target) {
            if (this.time == target.time) {
                return this.state - target.state;
            }
            return this.time - target.time;
        }
    }

    public int solution(int n, ArrayList<Time> timeArray) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(timeArray);

        int cnt = 0;

        for (Time time : timeArray) {
            if (time.state == 'S') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Time> timeArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int startTime = scanner.nextInt();
            int endTime = scanner.nextInt();
            timeArray.add(new Time('S', startTime));
            timeArray.add(new Time('E', endTime));
        }

        System.out.print(main.solution(n, timeArray));
    }
}
