import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            System.out.println(solve(a, b, c, d));
        }

        sc.close();
    }

    public static long solve(long a, long b, long c, long d) {

        if(d < b || a + (d-b) < c) {
        	return -1;
        }
        return (d-b)+ a + (d-b)-c;
    }
}