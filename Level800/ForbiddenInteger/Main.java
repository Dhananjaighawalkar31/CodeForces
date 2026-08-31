import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            solve(n, k, x);
        }
    }

    public static void solve(int n, int k, int x) {

        if (x == 1) {

            if (k == 1) {

                System.out.println("NO");

                return;
            }

            int count = n / k;
            int rem = n % k;

            if (rem == 0) {

                System.out.println("YES");
                System.out.println(count);

                for (int i = 0; i < count; i++) {
                    System.out.print(k + " ");
                }

                System.out.println();

                return;
            }

            if (rem >= 2 && rem <= k) {

                System.out.println("YES");
                System.out.println(count + 1);

                for (int i = 0; i < count; i++) {
                    System.out.print(k + " ");
                }

                System.out.println(rem);

                return;
            }

            if (k >= 3) {

                if (n % 2 == 0) {

                    int m = n / 2;

                    System.out.println("YES");
                    System.out.println(m);

                    for (int i = 0; i < m; i++) {
                        System.out.print(2 + " ");
                    }

                    System.out.println();

                    return;
                }

                if (n >= 3) {

                    int m = 1 + (n - 3) / 2;

                    System.out.println("YES");
                    System.out.println(m);

                    System.out.print(3 + " ");

                    for (int i = 0; i < m - 1; i++) {
                        System.out.print(2 + " ");
                    }

                    System.out.println();

                    return;
                }
            }

            System.out.println("NO");

            return;
        }

        System.out.println("YES");
        System.out.println(n);

        for (int i = 0; i < n; i++) {
            System.out.print(1 + " ");
        }

        System.out.println();
    }
}