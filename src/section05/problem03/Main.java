package section05.problem03;

import java.util.Stack;
import java.util.Scanner;
public class Main {

    public int solution(int n, int m, int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int row = 0; row < n; row++) {
                if (board[row][move-1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == board[row][move-1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[row][move-1]);
                    }
                    board[row][move-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }

        System.out.print(main.solution(n, m, board, moves));

    }
}
