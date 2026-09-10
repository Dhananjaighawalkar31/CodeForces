import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            System.out.println(solve(n));
        }

        sc.close();
    }

    public static int solve(int n) {

        int c = 0;

        while (n >= 10) {
            n /= 10;
            c += 9;
        }

        c += n;

        return c;
    }
}