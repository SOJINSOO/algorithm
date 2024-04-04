package section05.problem08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static class Person {
        int num;
        int priority;

        public Person(int num, int priority) {
            this.num = num;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] intArray) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, intArray[i]));
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();

            for (Person p : queue) {
                if (p.priority > person.priority) {
                    queue.offer(person);
                    person = null;
                    break;
                }
            }

            if (person != null) {
                answer++;
                if (person.num == m) {
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
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
