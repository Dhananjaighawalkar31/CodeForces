import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            int xK = sc.nextInt();
            int yK = sc.nextInt();

            int xQ = sc.nextInt();
            int yQ = sc.nextInt();

            System.out.println(solve(a, b, xK, yK, xQ, yQ));
        }

        sc.close();
    }

    public static int solve(int a, int b,
                            int xK, int yK,
                            int xQ, int yQ) {

        int[] dx;
        int[] dy;

        if (a == b) {

            dx = new int[]{a, a, -a, -a};
            dy = new int[]{a, -a, a, -a};

        } else {

            dx = new int[]{a, a, -a, -a, b, b, -b, -b};
            dy = new int[]{b, -b, b, -b, a, -a, a, -a};
        }

        int moves = dx.length;

        int[][] king = new int[moves][2];

        for (int i = 0; i < moves; i++) {
            king[i][0] = xK + dx[i];
            king[i][1] = yK + dy[i];
        }

        int[][] queen = new int[moves][2];

        for (int i = 0; i < moves; i++) {
            queen[i][0] = xQ + dx[i];
            queen[i][1] = yQ + dy[i];
        }

        int count = 0;

        for (int i = 0; i < moves; i++) {

            for (int j = 0; j < moves; j++) {

                if (king[i][0] == queen[j][0] &&
                    king[i][1] == queen[j][1]) {

                    count++;
                }
            }
        }

        return count;
    }
}