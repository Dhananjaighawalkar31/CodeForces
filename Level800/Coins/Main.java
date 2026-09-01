import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            System.out.println(solve(n, k));
        }

        sc.close();
    }

    public static String solve(long n, long k) {

        if(k==n || 2*k == n || k == 1 || n%2 == 0) {
        	return "YES";
        }
        if(k %2 == 1) {
        	return "YES";
        }

        return "NO";
    }
}