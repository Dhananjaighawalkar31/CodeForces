import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String s = sc.next();

            System.out.println(solve(n, m, x, s));
        }
    }

    public static int solve(int n, int m, String x, String s) {
    	if(x.contains(s)) {
    		return 0;
    	}

        int i = 0;
        while(x.length()<=m+n) {
        	x = x + x;
        	i++;
        	if(x.contains(s)) {
        		return i;
        	}
        }

        return -1;
    }
}