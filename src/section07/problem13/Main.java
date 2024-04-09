package section07.problem13;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int answer;
    public static int n;
    public static int m;
    public static ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
    public int[] check;

    public void DFS(int node) {
        if (node == 5) {
            answer++;
        }

        for (int i : arrayList.get(node)) {
            if (check[i] == 0){
                check[i] = 1;
                DFS(i);
                check[i] = 0;
            }

        }
    }
    public int solution() {
        answer = 0;
        check = new int[n+1];
        check[1] = 1;
        DFS(1);
        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            arrayList.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            arrayList.get(scanner.nextInt()).add(scanner.nextInt());
        }

        System.out.print(main.solution());
    }
}
