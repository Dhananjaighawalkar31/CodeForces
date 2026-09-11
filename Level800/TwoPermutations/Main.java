import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(solve(n, a, b));
        }

        sc.close();
    }

    public static String solve(int n, int a, int b) {

        if (a == n && b == n) {
            return "Yes";
        }

        if (a + b < n) {
            return "Yes";
        }

        return "No";
    }
}