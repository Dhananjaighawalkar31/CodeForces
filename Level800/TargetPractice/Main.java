import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            char[][] grid = new char[10][10];

            for (int i = 0; i < 10; i++) {
                String row = sc.next();

                for (int j = 0; j < 10; j++) {
                    grid[i][j] = row.charAt(j);
                }
            }

            System.out.println(solve(grid));
        }
    }

    public static int solve(char[][] grid) {

        int score = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if (grid[i][j] == 'X') {

                    int ring = Math.min(
                        Math.min(i, 9 - i),
                        Math.min(j, 9 - j)
                    ) + 1;

                    score += ring;
                }
            }
        }

        return score;
    }
}