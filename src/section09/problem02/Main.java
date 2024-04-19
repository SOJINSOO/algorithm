package section09.problem02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static class Time implements Comparable<Time> {
        int startTime;
        int endTime;

        public Time(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Time target) {
            if (this.endTime == target.endTime) {
                return this.startTime - target.startTime;
            }
            return this.endTime - target.endTime;
        }
    }

    public int solution(int n, ArrayList<Time> timeArray) {
        int answer = 0;
        int endTime = 0;
        Collections.sort(timeArray);

        for (Time time : timeArray) {
            if (time.startTime >= endTime) {
                endTime = time.endTime;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Time> timeArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            timeArray.add(new Time(scanner.nextInt(), scanner.nextInt()));
        }

        System.out.print(main.solution(n, timeArray));

    }
}
