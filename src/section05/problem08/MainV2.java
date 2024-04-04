package section05.problem08;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MainV2 {

    public class Person implements Comparable<Person> {
        int num;
        int priority;

        public Person(int num, int priority) {
            this.num = num;
            this.priority = priority;
        }

        @Override
        public int compareTo(Person target) {
            return target.priority - this.priority;
        }
    }
    public int solution(int n, int m, int[] intArray) {
        int answer = 0;
        PriorityQueue<Person> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, intArray[i]));
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            answer++;
            if (person.num == m) {
                break;
            }
        }

        return answer;
    }
    public static void main(String args[]) {
        MainV2 main = new MainV2();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, m, intArray));
    }
}
