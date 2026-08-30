import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            System.out.println(solve(a, b, c));
        }
    }

    public static String solve(long a, long b, long c) {

        if(a > b) {
        	return "First";
        }else if(a<b) {
        	return "Second";
        }

        return c%2 == 1 ? "First":"Second" ;
    }
}