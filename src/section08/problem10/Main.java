package section08.problem10;

import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer;

    public void DFS(int x, int y) {
        if (board[7][7] == 1) {
            answer++;
            return;
        }

        for (int i= 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && board[nx][ny] == 0) {
                board[nx][ny] = 1;
                DFS(nx, ny);
                board[nx][ny] = 0;
            }
        }

    }
    public int solution(int[][] board) {
        answer = 0;
        board[1][1]=1;

        DFS(1, 1);
        return answer;
    }
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        board=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=scanner.nextInt();
            }
        }

        System.out.print(main.solution(board));
    }
}
