import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            System.out.println(solve(n, k, x));
        }

        sc.close();
    }

    public static String solve(long n, long k, long x) {

        long min = k*(k+1)/2;
        long max = k*(2*n-k+1)/2;

        return min<=x && x<=max ? "YES":"NO";
    }
}