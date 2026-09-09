import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println(solve(n, a));
        }

        sc.close();
    }

    public static int solve(int n, int[] a) {

        int ans = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (a[i] % 2 == a[i - 1] % 2) {
                count++;
            } else {
                ans += count - 1;
                count = 1;
            }
        }

        ans += count - 1;

        return ans;
    }
}