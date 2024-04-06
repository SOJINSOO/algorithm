package section06.problem07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static class Point implements Comparable<Point> {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point target) {
            if (this.x == target.x) {
                return this.y - target.y;
            }
            return this.x - target.x;
        }
    }

    public ArrayList<Point> solution(int n, ArrayList<Point> arrayList) {
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Point> arrayList = new ArrayList<>();
        int x;
        int y;
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            arrayList.add(new Point(x, y));
        }

        for (Point point : main.solution(n, arrayList)) {
            System.out.print(point.x + " " + point.y);
            System.out.println();
        }
    }
}
