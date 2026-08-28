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

        int c = 0;

        for(int i = 0; i < 10; i++) {

            for(int j = 0; j < 10; j++) {

                char ch = grid[i][j];

                if(ch == 'X') {

                    if(i == 0 || j == 0 || j == 9 || i == 9) {

                        c++;

                    }else if(i == 1 || j == 1 || j == 8 || i == 8) {

                        c += 2;

                    }else if(i == 2 || j == 2 || j == 7 || i == 7) {

                        c += 3;

                    }else if(i == 3 || j == 3 || i == 6 || j == 6) {

                        c += 4;

                    }else if(i == 4 || j == 4 || i == 5 || j == 5) {

                        c += 5;

                    }

                }

            }

        }

        return c;

    }

}