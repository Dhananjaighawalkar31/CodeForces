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

        int xor = 0;

        for (int num : a) {
            xor ^= num;
        }

        if (n % 2 == 1) {
            return xor;
        }

        return xor == 0 ? 0 : -1;
    }
}